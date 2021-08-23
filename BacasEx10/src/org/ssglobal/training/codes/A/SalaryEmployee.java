package org.ssglobal.training.codes.A;

public class SalaryEmployee extends Employee {

	private double weeklySalary;

	
	public double getWeeklySalary() {
		return weeklySalary;
	}

	public void setWeeklySalary(double weeklySalary) {
		this.weeklySalary = weeklySalary;
	}

	@Override
	double calculateWeeklyPay() {
		return getWeeklySalary();
	}
	
	
	
	
}
