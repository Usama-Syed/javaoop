/**
 * 
 */
package com.training.javaoop.model;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
public final class Pizza {

	private final int idPizza;
	
	private final String pizzaName;
	
	private final List<String> ingredients;
	
	private Pizza(int idPizza, String pizzaName, List<String> ingredients) {
		this.idPizza = idPizza;
		this.pizzaName = pizzaName;
		this.ingredients = new ArrayList<String>(ingredients);
	}
	
	public static Pizza getPizza(int idPizza, String name, List<String> ingredients) {
		Pizza pizza = new Pizza(idPizza, name, ingredients);
		
		return pizza;
	}
	
	public static Pizza getPizza(int idPizza, String name) {
		Pizza pizza = new Pizza(idPizza, name, new ArrayList<String>());
		
		return pizza;
	}
	
	/**
	 * @return the idPizza
	 */
	public int getIdPizza() {
		return idPizza;
	}
	
	public float getIdPizza(int value) {
		return idPizza;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return pizzaName;
	}
	
	/**
	 * @return the ingredients
	 */
	public List<String> getIngredients() {
		return new ArrayList<String>(ingredients);
	}

}
