package com.longmt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.longmt.controller")
public class MVCConfiguration {
	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver viewResolvers = new InternalResourceViewResolver();
		viewResolvers.setViewClass(JstlView.class);
		viewResolvers.setPrefix("/WEB-INF/views/");
		viewResolvers.setSuffix(".jsp");
		
		return viewResolvers;
	}
}
