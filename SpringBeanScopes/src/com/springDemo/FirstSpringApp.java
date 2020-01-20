package com.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FirstSpringApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach coach = context.getBean("myCoach", Coach.class);
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getFortune());
		context.close();
	}
}
 