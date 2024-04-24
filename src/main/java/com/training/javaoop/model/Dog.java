package com.training.javaoop.model;

import java.io.Serializable;

public class Dog implements Animal, Serializable {
	
	private static final long serialVersionUID = 7424180328161691394L;
	
	@Override
	public int getFeetNumber() {
		return 4;
	}
	
	@Override
	public void sound() {
		System.out.println("The dog sound is bau bau");
	}
	
	@Override
	public String getHabitat() {
		return "Città";
	}
	
}
