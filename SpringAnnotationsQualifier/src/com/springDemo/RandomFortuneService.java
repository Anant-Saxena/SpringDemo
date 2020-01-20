package com.springDemo;

import java.util.Random;

import org.springframework.stereotype.Component;


@Component
public class RandomFortuneService implements FortuneService{

	private String[] data = {
			"This is Random Fortune Service",
			"This is a dummy statement",
			"This is another one"
	};
	private Random myRandom = new Random();
	@Override
	public String getFortune() {
		int index = myRandom.nextInt(data.length);
		// TODO Auto-generated method stub
		return data[index];
	}

}
