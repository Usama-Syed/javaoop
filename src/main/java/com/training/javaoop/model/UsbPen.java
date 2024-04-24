/**
 * 
 */
package com.training.javaoop.model;

public class UsbPen extends MemoryDevice {

	public UsbPen(int size, String serialNumber, boolean exapandable) {
		super(size, serialNumber, exapandable);
	}
	
	@Override
	public void saveData(String inputData) {
		System.out.println("Ho salvato il dato \" " + inputData + "\" sulla chiavetta usb");
	}

}
