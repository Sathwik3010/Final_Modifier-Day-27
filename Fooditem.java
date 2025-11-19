package com.codegnan.abstraction;

public abstract class Fooditem {

	String name;
	double basePrice;
	
	
	public Fooditem(String name, double basePrice) {
		super();
		this.name = name;
		this.basePrice = basePrice;
	}

	public abstract double calculateTotalPrice();
	public abstract String getCategory();
	public abstract int getPreparationTime();
	public void display() {
		System.out.println("Food Item: "+name);
		System.out.println("Base Price: "+basePrice);
	}

}
