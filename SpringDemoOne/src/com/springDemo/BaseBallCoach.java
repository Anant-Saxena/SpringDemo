package com.springDemo;

public class BaseBallCoach implements Coach{
	
	@Override
	public String getDailyWorkout(){
		return "Spend 30 minutes on batting practice";
	}
}
