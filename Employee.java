package com.codegnan.abstraction;

public abstract class Employee {
	protected String name;

	public Employee(String name) {
		super();
		this.name = name;
	}
	
	abstract double calculateSalary();
	
	public void display() {
		System.out.println("Employee Name: "+name);
	}
}
