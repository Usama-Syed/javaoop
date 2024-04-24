package com.training.javaoop.model;

public class Snake implements Animal {
	
	@Override
	public int getFeetNumber() {
		return 0;
	}
	
	@Override
	public void sound() {
		System.out.println("The Snake sound is ssss");
	}
	
	@Override
	public String getHabitat() {
		return "Foresta";
	}
	
}
