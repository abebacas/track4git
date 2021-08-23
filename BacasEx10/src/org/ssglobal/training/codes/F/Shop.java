package org.ssglobal.training.codes.F;

public class Shop {

	public String storeManagerName = "Juan dela Cruz";
	public String employeeName;
	private double taxRate;
	private double itemPrice;
	
	Shop assistant1 = new Shop();
	Shop assistant2 = new Shop();
	Shop assistant3 = new Shop();
	
	public double getTaxRate() {
		return this.taxRate;
	}
	
	public void setTaxRate(double taxRate) {
		this.taxRate = taxRate;
	}
	
	public double getItemPrice() {
		return itemPrice;
	}
	
	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

}

