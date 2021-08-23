package org.ssglobal.training.codes;

import java.util.ArrayList;
import java.util.List;

public class DbEmployee {

	public List<Employee> emptbl;
	
	public DbEmployee() {
		this.emptbl = new ArrayList<>();
	}
	
	public List<Employee> addEmployee(String fname, String lname, Integer age, Float salary) {
		this.emptbl.add(new Employee (fname, lname, age, salary));
		return this.emptbl;
	}
}
