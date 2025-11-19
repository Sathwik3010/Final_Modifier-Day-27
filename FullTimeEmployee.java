package com.codegnan.abstraction;

public class FullTimeEmployee extends Employee {

	private double monthlySalary;
	
	public FullTimeEmployee(String name, double monthlySalary) {
		super(name);
		this.monthlySalary = monthlySalary;
	}

	@Override
	double calculateSalary() {
		// TODO Auto-generated method stub
		return monthlySalary;
	}

}
