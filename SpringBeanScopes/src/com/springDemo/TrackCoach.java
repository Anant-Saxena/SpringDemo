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
}
