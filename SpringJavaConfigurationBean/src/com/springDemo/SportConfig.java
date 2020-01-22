package com.springDemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//we can remove this ComponentScan file as bean are manually assigned
//@ComponentScan("com.springDemo")
public class SportConfig {

	//method name is actually the bean Id that is registered
	@Bean
	public FortuneService sadFortuneService(){
		return new SadFortuneService();
	}
	//define method for our swimCoach and inject the dependency
	@Bean
	public Coach swimCoach(){
		return new SwimCoach(sadFortuneService());
	}
}
