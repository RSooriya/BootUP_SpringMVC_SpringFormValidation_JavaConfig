package com.sooriya.Configuration;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan("com.sooriya")
public class SpringConfig implements WebMvcConfigurer {

@Bean
public ViewResolver viewResolver()
{
	InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
	viewResolver.setPrefix("/WEB-INF/view/");
	viewResolver.setSuffix(".jsp");
	return viewResolver;
	
}
// to retreive message.properties file under src/main/resources - to display validation message 
@Bean
public MessageSource messageSource()
{
	ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
	messageSource.setBasenames("messages");
	return messageSource;
}
// to retreive css file inside webapp/resources/css - to handle all webapp resources
public void addResourceHandlers(final ResourceHandlerRegistry registry)
{
	registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
}
	
}
