/**
 * 
 */
package com.training.javaoop.model;

import java.util.Arrays;

/**
 * 
 */
public class Car {
	
	public static final String CAR_ATTRIBUTES = "Model; Construction Year; Supply Type; Port Number; Automated";
	
	private String model;
	
	private int constructionYear;
	
	private SupplyType supplyType;
		
	private int portNumber;
	
	private static boolean automated = true;
	
	private Tier[] tiers = new Tier[4];
	
	private boolean started;
	
	private String location;
	
	public Car() {
		super();
	}
	
	/**
	 * @param model
	 * @param constructionYear
	 * @param supplyType
	 * @param portNumber
	 */
	public Car(String model, int constructionYear, SupplyType supplyType, int portNumber) {
		this.model = model;
		this.constructionYear = constructionYear;
		this.supplyType = supplyType;
		this.portNumber = portNumber;
		tiers[0] = new Tier();
	}
	
	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}
	
	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * @return the constructionYear
	 */
	public int getConstructionYear() {
		return constructionYear;
	}

	/**
	 * @param constructionYear the constructionYear to set
	 */
	public void setConstructionYear(int constructionYear) {
		this.constructionYear = constructionYear;
	}

	/**
	 * @return the supplyType
	 */
	public SupplyType getSupplyType() {
		return supplyType;
	}
	
	/**
	 * @param supplyType the supplyType to set
	 */
	public void setSupplyType(SupplyType supplyType) {
		this.supplyType = supplyType;
	}

	
	/**
	 * @return the portNumber
	 */
	public int getPortNumber() {
		return portNumber;
	}

	/**
	 * @param portNumber the portNumber to set
	 */
	public void setPortNumber(int portNumber) {
		this.portNumber = portNumber;
	}

	/**
	 * @return the automated
	 */
	public static boolean isAutomated() {
		return automated;
	}
	
	/**
	 * @param automated the automated to set
	 */
	public static void setAutomated(boolean automated) {
		Car.automated = automated;
	}

	/**
	 * @return the tiers
	 */
	public Tier[] getTiers() {
		return tiers;
	}

	/**
	 * @param tiers the tiers to set
	 */
	public void setTiers(Tier[] tiers) {
		this.tiers = tiers;
	}
	
	/**
	 * @return the started
	 */
	public boolean isStarted() {
		return started;
	}
	
	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}
	
	public void startCar() {
		started = true;
	}
	
	public void stopCar() {
		started = false;
	}
	
	//I tre metodi hanno lo stesso nome, ma parametri diversi o come numerosità o come tiplogia
	//Non possono esserci più metodi con lo stesso nome e gli stessi parametri nella stessa classe
	public boolean moveCar() {
		if (started) {
			location = "HOME";
		}
		
		return started;
	}
	
	public boolean moveCar(String location) {
		if (started) {
			this.location = location;
		}
		
		return started;
	}
	
	public boolean moveCar(int location) {
		if (started) {
			this.location = "" + location;
		}
		
		return started;
	}
	
	@Override
	public String toString() {
		return "Car [model=" + model + ", constructionYear=" + constructionYear + ", supplyType=" + supplyType
				+ ", portNumber=" + portNumber + ", tiers=" + Arrays.toString(tiers) + "]";
	}
	
}
