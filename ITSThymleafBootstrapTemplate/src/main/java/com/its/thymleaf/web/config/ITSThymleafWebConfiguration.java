package com.its.thymleaf.web.config;

import javax.servlet.Filter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.its.thymleaf.web.filter.ITSThymleafWebFilter;

@Configuration
public class ITSThymleafWebConfiguration extends WebMvcConfigurerAdapter {

	@Bean
	public Filter filter() {
		return new ITSThymleafWebFilter();
	}

	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**");
	}
}
