package org.ssglobal.training.codes.A;

public abstract class Employee {

	private String employeeName;
	private String jobTitle;
	
	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	abstract double calculateWeeklyPay(); 
}
