/**
 * 
 */
package com.training.javaoop.model;

public abstract class MemoryDevice {
	
	private int size;
	
	private String serialNumber;
	
	private boolean exapandable;
		
	/**
	 * @param size
	 * @param serialNumber
	 * @param exapandable
	 */
	public MemoryDevice(int size, String serialNumber, boolean exapandable) {
		this.size = size;
		this.serialNumber = serialNumber;
		this.exapandable = exapandable;
	}
	
	/**
	 * @return the size
	 */
	public int getSize() {
		return size;
	}

	/**
	 * @param size the size to set
	 */
	public void setSize(int size) {
		this.size = size;
	}

	/**
	 * @return the serialNumber
	 */
	public String getSerialNumber() {
		return serialNumber;
	}

	/**
	 * @param serialNumber the serialNumber to set
	 */
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	/**
	 * @return the exapandable
	 */
	public boolean isExapandable() {
		return exapandable;
	}

	/**
	 * @param exapandable the exapandable to set
	 */
	public void setExapandable(boolean exapandable) {
		this.exapandable = exapandable;
	}
	
	public abstract void saveData(String inputData);
	
}
