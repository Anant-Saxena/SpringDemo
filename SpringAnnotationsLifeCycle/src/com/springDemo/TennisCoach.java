package com.springDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("tennisCoach")
public class TennisCoach implements Coach {

private FortuneService fortuneService;

//for setter injection
@Autowired
@Qualifier("randomFortuneService")
public void setFortuneService(FortuneService fortuneService) {
	System.out.println("inside setter method");
	this.fortuneService = fortuneService;
}

public TennisCoach(){
	System.out.println("Inside the constructor");
}

//for constructor injection
//@Autowired
//public TennisCoach(FortuneService fortuneService) {
//	this.fortuneService = fortuneService;
//	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice Tennis 5 hours a day";
	}

	
	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
