package com.training.javaoop;

import com.training.javaoop.model.Car;

public class JavaOop {
	
	public static void main(String[] args) {
		manageCar();
	}

	private static void manageCar() {
		Car myCar = new Car();
		myCar = new Car("BMW", 2010, "Metano", 5);
		
		System.out.println("My car is a " + myCar.getModel() + ", built in year " + myCar.getConstructionYear() 
						+ ", the fuel type is " + myCar.getSupplyType() + " and has " + myCar.getPortNumber() + " ports");
	}

}
