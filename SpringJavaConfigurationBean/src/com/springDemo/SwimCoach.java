package com.springDemo;

public class SwimCoach implements Coach{

	FortuneService fortune;
	public SwimCoach(FortuneService theFortune) {
		// TODO Auto-generated constructor stub
		fortune = theFortune;
	}
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run 1km for warm up";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortune.getFortune();
	}

}
