package com.training.javaoop.model;

public class Tier {

	private String seriesNumber;
	
	private String season;
	
	private String material;
	
	private double attrito;
	
	private int durabilty;

	/**
	 * @return the seriesNumber
	 */
	public String getSeriesNumber() {
		return seriesNumber;
	}

	/**
	 * @param seriesNumber the seriesNumber to set
	 */
	public void setSeriesNumber(String seriesNumber) {
		this.seriesNumber = seriesNumber;
	}

	/**
	 * @return the season
	 */
	public String getSeason() {
		return season;
	}

	/**
	 * @param season the season to set
	 */
	public void setSeason(String season) {
		this.season = season;
	}

	/**
	 * @return the material
	 */
	public String getMaterial() {
		return material;
	}

	/**
	 * @param material the material to set
	 */
	public void setMaterial(String material) {
		this.material = material;
	}

	/**
	 * @return the attrito
	 */
	public double getAttrito() {
		return attrito;
	}

	/**
	 * @param attrito the attrito to set
	 */
	public void setAttrito(double attrito) {
		this.attrito = attrito;
	}

	/**
	 * @return the durabilty
	 */
	public int getDurabilty() {
		return durabilty;
	}

	/**
	 * @param durabilty the durabilty to set
	 */
	public void setDurabilty(int durabilty) {
		this.durabilty = durabilty;
	}

	@Override
	public String toString() {
		return "Tier [seriesNumber=" + seriesNumber + ", season=" + season + ", material=" + material + ", attrito="
				+ attrito + ", durabilty=" + durabilty + "]";
	}
	
	
}
