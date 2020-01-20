package com.springDemo;

public class CricketCoach implements Coach {

	public FortuneService fortuneService;
	
	public CricketCoach(){
		System.out.println("inside Constructor with no args");
	}
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("inside setter method");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Try practicing fast bowling";
	}

	@Override
	public String getFortune() {
		return fortuneService.getFortune();
	}

}
