package com.training.javaoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.training.javaoop.constants.ProjectConstants;
import com.training.javaoop.model.Car;
import com.training.javaoop.model.ElectricCar;
import com.training.javaoop.model.Pizza;
import com.training.javaoop.model.SupplyType;

public class JavaOop {
	
	public static void main(String[] args) {
		//manageCar();
		//enumLesson();
		//printPizza();
		printElectricCar();
	}
	
	private static void manageCar() {
		Car myCar = new Car();
		myCar = new Car("BMW", 2010, SupplyType.GAS, 5);
		
		Car.setAutomated(false);
		String automated =  Car.isAutomated() ? ProjectConstants.AUTOMATED : ProjectConstants.NOT_AUTOMATED;
		
		System.out.println("Attributi gestiti dalla Classe Car: ");
		System.out.println(Car.CAR_ATTRIBUTES);
		
		System.out.println("My car is a " + myCar.getModel() + ", built in year " + myCar.getConstructionYear() 
						+ ", the fuel type is " + myCar.getSupplyType() + " and has " + myCar.getPortNumber() + " ports");
		
		System.out.println("The car is " + automated);
		
	}
	
	private static void enumLesson() {
		Car myCar = new Car("BMW", 2010, SupplyType.GAS, 5);
		myCar.setSupplyType(SupplyType.HYBRID);
		
		SupplyType mySupplyType = myCar.getSupplyType();
		String result = null;
		
		switch (mySupplyType) {
		case PETROL: 
			result = "Petrol";
			break;
		case DIESEL: 
			result = "Diesel";
			break;
		case GAS: 
			result = "Gas";
			break;
		case ELECTRIC: 
			result = "Electric";
			break;
		case HYBRID: 
			result = "Hybrid";
			break;
		default:
			result = "Non gestito";
			break;
		}
		
		System.out.println("My car is a " + myCar.getModel() + ", built in year " + myCar.getConstructionYear() 
		+ ", the fuel type is " + result + " and has " + myCar.getPortNumber() + " ports");
		
		System.out.println("\nThe supported supply types are: ");
		for (SupplyType supply : SupplyType.values()) {
			System.out.println(supply);
		}
		
		System.out.println(myCar.toString());
		
	}
	
	private static void printElectricCar() {
		ElectricCar elecCar = new ElectricCar("BMW", 2015, SupplyType.PETROL, 5);
		String charged = "";
		System.out.println("The electrical car model is: " + elecCar.getModel());
		System.out.println("The electrical car supply type is: " + elecCar.getSupplyType());
		
		elecCar.setBatteryType("Litio");
		elecCar.setBatteryLevel(19);
		elecCar.setBatteryCharged(false);
		
		if (!elecCar.isBatteryCharged()) {
			charged = " not";
		}
		
		System.out.println("The electrical car battery type is " + elecCar.getBatteryType() + " and the battery level is " + elecCar.getBatteryLevel() +  
				"% and the battery is" + charged + " charged" );
		
		System.out.println(elecCar.toString());
	}
	
	private static void printPizza() {
		String[] oginialIngredients = new String[]{ProjectConstants.POMODRO, ProjectConstants.MOZZARELLA};
		int idPizza = 1;
		String pizzaName = "Margherita";
		List<String> ingredientList = new ArrayList<String>(Arrays.asList(oginialIngredients));
		
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
		//ingredientList.set(1, "Cipolla");
		ingredientList.add("Cipolla");
		
		idPizza = myPizza.getIdPizza();
		
		System.out.println("Stampa valori post modifica parametri");
		System.out.println("Id Pizza 2: " + myPizza.getIdPizza());
		System.out.println("Nome Pizza 2: " + myPizza.getName());
		System.out.println("Ingredienti Pizza 2: " + myPizza.getIngredients());
		
		myPizza.getIngredients().add("Tonno");
		//ingredientList.add("Tonno");
		System.out.println("Ingredienti Pizza 2: " + myPizza.getIngredients());
		
	}

}
