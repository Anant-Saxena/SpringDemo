package com.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterMainApp {

	public static void main(String[] args) {
		
		//load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get bean from the container
		CricketCoach coach = context.getBean("myCricketCoach",CricketCoach.class);
		//call the methods
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getFortune());
		coach.printTeamNames();
		coach.printMap();
		//close the context
		context.close();
		
	}
}
