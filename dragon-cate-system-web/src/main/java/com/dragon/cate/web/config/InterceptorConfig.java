package com.dragon.cate.web.config;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@EnableWebMvc
@SpringBootApplication
public class InterceptorConfig extends WebMvcConfigurerAdapter {


	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/**.js").addResourceLocations("classpath*:/static/");
		registry.addResourceHandler("/**.css").addResourceLocations("classpath*:/static/");
		registry.addResourceHandler("/**.png").addResourceLocations("classpath*:/static/");
		registry.addResourceHandler("/**.jpg").addResourceLocations("classpath*:/static/");
		registry.addResourceHandler("/**.jpeg").addResourceLocations("classpath*:/static/");
		registry.addResourceHandler("/**.ico").addResourceLocations("classpath*:/static/");
	}

	@Override
	public void addInterceptors(InterceptorRegistry registry) {

	}


}
