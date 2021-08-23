package org.ssglobal.training.codes.A;

public class HourlyEmployee extends Employee {

	private double payRate;
	private double hrsWork;

	@Override
	double calculateWeeklyPay() {
		return payRate * hrsWork;	
	}
}
