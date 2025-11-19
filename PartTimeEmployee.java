package com.codegnan.abstraction;

public class PartTimeEmployee extends Employee{
	private double hourlyRate;
	private int hoursWorked;
	
	public PartTimeEmployee(String name, double hourlyRate, int hoursWorked) {
		super(name);
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
		// TODO Auto-generated constructor stub
	}

	@Override
	double calculateSalary() {
		// TODO Auto-generated method stub
		return hourlyRate * hoursWorked;
	}
	
}
