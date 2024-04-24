/**
 * 
 */
package com.training.javaoop.model;

public class Hen implements Animal {

	@Override
	public int getFeetNumber() {
		return 2;
	}

	@Override
	public void sound() {
		System.out.println("The hen sound is chi chi ri chi");
	}

	@Override
	public String getHabitat() {
		return "Terra";
	}

}
