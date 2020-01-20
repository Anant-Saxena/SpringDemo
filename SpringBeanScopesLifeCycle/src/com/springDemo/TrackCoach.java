package com.springDemo;

public class TrackCoach implements Coach{

	public FortuneService furtuneService;
	
	public TrackCoach(FortuneService fortuneService) {
		// TODO Auto-generated constructor stub
		this.furtuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout(){
		return "Run for 5km daily";
	}

	@Override
	public String getFortune() {
		return furtuneService.getFortune();
	}
	//init method
	public void doSomeStuffinit(){
		System.out.println("Do Some stuff before initializing a bean");
	}
	// destroy method
	public void doSomeCleaningStuff(){
		System.out.println("Do some stuff cleaning stuff");
	}
}
