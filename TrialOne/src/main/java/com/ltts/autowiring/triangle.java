package com.ltts.autowiring;

import org.springframework.stereotype.Component;

@Component
public class triangle implements Shape {

	@Override
	public void calculateArea(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("Triangle area is "+0.5*x*y);
	}

}
