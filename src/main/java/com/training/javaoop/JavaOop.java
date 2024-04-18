package com.training.javaoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.training.javaoop.constants.ProjectConstants;
import com.training.javaoop.model.Car;
import com.training.javaoop.model.Pizza;

public class JavaOop {
	
	public static void main(String[] args) {
		//manageCar();
		printPizza();
	}
	
	private static void manageCar() {
		Car myCar = new Car();
		myCar = new Car("BMW", 2010, 5);
		
		Car.setAutomated(false);
		String automated =  Car.isAutomated() ? ProjectConstants.AUTOMATED : ProjectConstants.NOT_AUTOMATED;
		
		System.out.println("Attributi gestiti dalla Classe Car: ");
		System.out.println(Car.CAR_ATTRIBUTES);
		
		System.out.println("My car is a " + myCar.getModel() + ", built in year " + myCar.getConstructionYear() 
						+ ", the fuel type is " + myCar.getSupplyType() + " and has " + myCar.getPortNumber() + " ports");
		
		System.out.println("The car is " + automated);
		
	}
	
	private static void printPizza() {
		String[] oginialIngredients = new String[]{"Pomodoro", "Mozzarella"};
		int idPizza = 1;
		String pizzaName = "Margherita";
		List<String> ingredientList = Arrays.asList(oginialIngredients);
		
		Pizza myPizza = Pizza.getPizza(idPizza, pizzaName, ingredientList);
		
		System.out.println("Id Pizza: " + myPizza.getIdPizza());
		System.out.println("Nome Pizza: " + myPizza.getName());
		System.out.println("Ingredienti Pizza: " + myPizza.getIngredients());
		System.out.println("Ref pizza 1: " + myPizza);
		idPizza = 2;
		
		myPizza = Pizza.getPizza(idPizza, pizzaName, ingredientList);
		System.out.println("Ref pizza 2: " + myPizza);
		System.out.println("Id Pizza 2: " + myPizza.getIdPizza());
		System.out.println("Nome Pizza 2: " + myPizza.getName());
		System.out.println("Ingredienti Pizza 2: " + myPizza.getIngredients());
		
		idPizza = 3;
		pizzaName = "Pugliese";
		ingredientList.set(1, "Cipolla");
		
		idPizza = myPizza.getIdPizza();
		
		System.out.println("Stampa valori post modifica parametri");
		System.out.println("Id Pizza 2: " + myPizza.getIdPizza());
		System.out.println("Nome Pizza 2: " + myPizza.getName());
		System.out.println("Ingredienti Pizza 2: " + myPizza.getIngredients());
		
		
	}

}
