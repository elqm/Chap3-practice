package com.greedy.level02.normal;

public class RandomMaker {

	public int randomNumber(min, max) {
		
		int num1 = (int) (Math.random());
		System.out.println("난수1 : ");
		int num2 = (int) (Math.random());
		System.out.println("난수2 : ");
		
		if(num1 > num2) {
			max = num1;
			min = num2;
		} else {
			max = num2;
			min = num1;
		}
		
		for(int i = min; i <= max; i++) {
			return i;
		}
		
		
	}
	
}
