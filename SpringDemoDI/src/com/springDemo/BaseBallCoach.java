package com.springDemo;

public class BaseBallCoach implements Coach{
	
	public FortuneService fortuneService;
	
	public BaseBallCoach(FortuneService fortuneService) {
	this.fortuneService = fortuneService;
	}
	@Override
	public String getDailyWorkout(){
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
}
