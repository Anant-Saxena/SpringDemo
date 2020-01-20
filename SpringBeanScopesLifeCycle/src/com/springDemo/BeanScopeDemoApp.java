package com.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("BeanScope-applicationContext.xml");
		Coach theCoach = context.getBean("trackCoach", Coach.class);
		Coach coach = context.getBean("trackCoach", Coach.class);
		
		boolean result = (theCoach == coach);
		System.out.println("\n Pointing to the same Object" + result);
		System.out.println("\nMemory location of the theCoach" + theCoach);
		System.out.println("\nMemory location of the coach" + coach);
		context.close();
	}
}
