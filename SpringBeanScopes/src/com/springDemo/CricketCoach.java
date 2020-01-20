package com.springDemo;

import java.util.List;
import java.util.Map;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	private List<String> teamNames;
	private Map<String, String> map;
	
	
	public Map<String, String> getMap() {
		return map;
	}
	public void setMap(Map<String, String> map) {
		this.map = map;
	}
	public List<String> getTeamNames() {
		return teamNames;
	}
	public void setTeamNames(List<String> teamNames) {
		this.teamNames = teamNames;
	}
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
	public void printTeamNames(){
		System.out.println(this.teamNames);
	}
	public void printMap(){
		System.out.println(this.map);
	}

}
