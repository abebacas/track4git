package org.ssglobal.training.codes.F;

public class ShopItems {

	public void showPrice() {
		Shop item1 = new Shop();
		Shop item2 = new Shop();
		Shop item3 = new Shop();

		
		// Items and its price
		item1.setItemPrice(10);
		item1.setTaxRate(0.12);
		System.out.println("Item Price: " + item1.getItemPrice());
		System.out.println("Tax Rate: " + item1.getTaxRate());

		item2.setItemPrice(20);
		item2.setTaxRate(0.05);
		System.out.println("Item Price: " + item2.getItemPrice());
		System.out.println("Tax Rate: " + item2.getTaxRate());
		
		item3.setItemPrice(100);
		item3.setTaxRate(0.30);
		System.out.println("Item Price: " + item3.getItemPrice());
		System.out.println("Tax Rate: " + item3.getTaxRate());
	}
}
