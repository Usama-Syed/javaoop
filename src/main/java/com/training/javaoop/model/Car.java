/**
 * 
 */
package com.training.javaoop.model;

/**
 * 
 */
public class Car {
	
	private String model;
	
	private int constructionYear;
	
	private String supplyType;
	
	private int portNumber;
	
	public Car() {
		super();
	}
	
	/**
	 * @param model
	 * @param constructionYear
	 * @param supplyType
	 * @param portNumber
	 */
	public Car(String model, int constructionYear, String supplyType, int portNumber) {
		this.model = model;
		this.constructionYear = constructionYear;
		this.supplyType = supplyType;
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
		return supplyType;
	}

	/**
	 * @param supplyType the supplyType to set
	 */
	public void setSupplyType(String supplyType) {
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
	
}
