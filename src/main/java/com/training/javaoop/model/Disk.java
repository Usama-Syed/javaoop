/**
 * 
 */
package com.training.javaoop.model;

/**
 * 
 */
public class Disk extends MemoryDevice {

	
	public Disk(int size, String serialNumber, boolean exapandable) {
		super(size, serialNumber, exapandable);
	}
	
	@Override
	public void saveData(String inputData) {
		System.out.println("Ho salvato il dato \"" + inputData + "\" sul disco");
	}
	
}
