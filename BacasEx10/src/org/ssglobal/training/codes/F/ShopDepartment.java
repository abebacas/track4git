package org.ssglobal.training.codes.F;

public class ShopDepartment {

	public void showManagerNames() {
		Shop department1 = new Shop();
		Shop department2 = new Shop();
		Shop department3 = new Shop();
		
		// Department Manager Names
		department1.setEmployeeName("Mark Reyes");
		System.out.println("Manager: " + department1.getEmployeeName());
		
		department2.setEmployeeName("Juan Luna");
		System.out.println("Manager: " + department2.getEmployeeName());
		
		department3.setEmployeeName("John Smith");
		System.out.println("Manager: " + department3.getEmployeeName());		
	}
	
}
