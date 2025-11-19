package com.codegnan.abstraction;

public class ContractEmployee extends Employee{

	private double contractAmount;
	
	public ContractEmployee(String name, double contractAmount) {
		super(name);
		this.contractAmount=contractAmount;
	}

	@Override
	double calculateSalary() {
		// TODO Auto-generated method stub
		return contractAmount;
	}

}
