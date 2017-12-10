package com.osfg.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;

import org.springframework.core.annotation.Order;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

/**
 * 
 * @author athakur This is the starting point. WebApplicationInitializer is an
 *         interface provided by Spring MVC that ensures your implementation is
 *         detected and automatically used to initialize any Servlet 3
 *         container.
 */
@Order(1)
public class WebAppInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext container) {

		AnnotationConfigWebApplicationContext rootContext = new AnnotationConfigWebApplicationContext();

		rootContext.register(RootApplicationConfig.class);

		container.addListener(new ContextLoaderListener(rootContext));

		AnnotationConfigWebApplicationContext displacherContext = new AnnotationConfigWebApplicationContext();
		displacherContext.register(MyWebConfig.class);

		ServletRegistration.Dynamic registration = container.addServlet("dispatcher",
				new DispatcherServlet(displacherContext));
		registration.setLoadOnStartup(1);
		registration.addMapping("/");
	}

}