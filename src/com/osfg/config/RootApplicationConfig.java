package com.osfg.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * 
 * @author athakur
 * Root applciation context
 * Services and data sources should go here - common to all web application contexts
 */
@Configuration
@ComponentScan({ "com.osfg" })
@PropertySource(value = { "classpath:com/osfg/resources/spring-props.properties" })
public class RootApplicationConfig {


}
