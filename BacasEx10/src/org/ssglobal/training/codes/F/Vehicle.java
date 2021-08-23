package org.ssglobal.training.codes.F;

public abstract class Vehicle {

	private String ownerName;
	private double taxDiscount;
	public int numWheels;
	
	public String getOwnerName() {
		return ownerName;
	}
	
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	
	public double getTaxDiscount() {
		return taxDiscount;
	}
	
	public void setTaxDiscount(double taxDiscount) {
		this.taxDiscount = taxDiscount;
	}
	
	abstract void setNumVehicleWheel(int numWheels);
	
}
