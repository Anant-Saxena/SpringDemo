package com.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAnnotationDemoApp {
	public static void main(String[] args) {
     ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
     Coach coach = context.getBean("myTennisCoach", Coach.class);
     System.out.println(coach.getDailyWorkout());
     context.close();
	}
}
