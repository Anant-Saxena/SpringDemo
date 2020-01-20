package com.springDemo;

import org.springframework.stereotype.Component;
//Add the component annotation as spring should know that this is new component
@Component
public class HappyFortuneService implements FortuneService{

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "Today is your lucky day";
	}

	
}
