package com.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("BeanLifeCycle-applicationContext.xml");
		Coach coach = context.getBean("trackCoach", Coach.class);
		System.out.println(coach.getDailyWorkout());
		context.close();
	}
}

