package com.osfg.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * 
 * @author athakur
 * Dispacher servlet context - web app context
 * All Controllers. handler mappings, viewresolvers etc should go here
 */
@Configuration
@ComponentScan({ "com.osfg.controllers" })
@EnableWebMvc
public class MyWebConfig {
	
    @Bean
    public ViewResolver getViewResolver(){
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/pages/");
        resolver.setSuffix(".jsp");
        return resolver;
    }

}