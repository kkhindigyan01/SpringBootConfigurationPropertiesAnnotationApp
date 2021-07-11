package com.kkhindigyan.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.PropertySource;

import com.kkhindigyan.app.model.KKJavaTutorials;

@SpringBootApplication
@PropertySource(value = { "classpath:kkjava.properties" })
@EnableConfigurationProperties(value = {KKJavaTutorials.class})
public class SpringBootConfigurationPropertiesAnnotationAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringBootConfigurationPropertiesAnnotationAppApplication.class, args);
		
		KKJavaTutorials kkJavaTutorials = applicationContext.getBean(KKJavaTutorials.class);
		System.out.println(kkJavaTutorials);
	}
	
	/*
	 * @Bean
	 * 
	 * @ConfigurationProperties public KKJavaTutorials javaTutorials() { return new
	 * KKJavaTutorials(); }
	 */

}
