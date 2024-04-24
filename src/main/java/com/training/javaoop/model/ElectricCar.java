package com.training.javaoop.model;

public class ElectricCar extends Car {
	
	private String batteryType;
	
	private int batteryLevel;
	
	private boolean batteryCharged;
	
	public ElectricCar() {
		super();
	}
	
	/**
	 * @param batteryType
	 * @param batteryLevel
	 * @param batteryCharged
	 */
	public ElectricCar(String model, int constructionYear, SupplyType supplyType, int portNumber, 
			String batteryType, int batteryLevel, boolean batteryCharged) {
		super(model, constructionYear, supplyType, portNumber);
		this.batteryType = batteryType;
		this.batteryLevel = batteryLevel;
		this.batteryCharged = batteryCharged;
	}
	
	/**
	 * @param model
	 * @param constructionYear
	 * @param supplyType
	 * @param portNumber
	 */
	public ElectricCar(String model, int constructionYear, SupplyType supplyType, int portNumber) {
		super(model, constructionYear, supplyType, portNumber);
	}
	
	/**
	 * @return the batteryType
	 */
	public String getBatteryType() {
		return batteryType;
	}

	/**
	 * @param batteryType the batteryType to set
	 */
	public void setBatteryType(String batteryType) {
		this.batteryType = batteryType;
	}

	/**
	 * @return the batteryLevel
	 */
	public int getBatteryLevel() {
		return batteryLevel;
	}

	/**
	 * @param batteryLevel the batteryLevel to set
	 */
	public void setBatteryLevel(int batteryLevel) {
		this.batteryLevel = batteryLevel;
	}

	/**
	 * @return the batteryCharged
	 */
	public boolean isBatteryCharged() {
		return batteryCharged;
	}

	/**
	 * @param batteryCharged the batteryCharged to set
	 */
	public void setBatteryCharged(boolean batteryCharged) {
		this.batteryCharged = batteryCharged;
	}
	
	@Override
	public boolean moveCar() {
		if (batteryCharged) {
			super.moveCar();
		}
		
		return isStarted() && batteryCharged;
	}
	
	@Override
	public boolean moveCar(String location) {
		if (batteryCharged) {
			super.moveCar(location);
		}
		
		return isStarted() && batteryCharged;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nElectricCar [batteryType=" + batteryType + ", batteryLevel=" + batteryLevel + ", batteryCharged="
				+ batteryCharged + "]";
	}
	
}
