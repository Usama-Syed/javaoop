/**
 * 
 */
package com.training.javaoop.model;

/**
 * 
 */
public class Car {
	
	public static final String CAR_ATTRIBUTES = "Model; Construction Year; Supply Type; Port Number; Automated";
	
	private String model;
	
	private int constructionYear;
	
	private final String SUPPLY_TYPE = "Petrol";
	
	private int portNumber;
	
	private static boolean automated = true;
	
	public Car() {
		super();
		//this.SUPPLY_TYPE = "Petrol";
	}
	
	/**
	 * @param model
	 * @param constructionYear
	 * @param supplyType
	 * @param portNumber
	 */
	public Car(String model, int constructionYear, int portNumber) {
		this.model = model;
		this.constructionYear = constructionYear;
		this.portNumber = portNumber;
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
	public String getSupplyType() {
		return SUPPLY_TYPE;
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
	
}
