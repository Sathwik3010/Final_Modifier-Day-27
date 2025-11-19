package com.codegnan.abstraction;

public class ChickenBurger extends Fooditem{
	final double deliveryCharge=70;
	
	public ChickenBurger(String name, double basePrice) {
		super(name, basePrice);
	}

	@Override
	public double calculateTotalPrice() {
		// TODO Auto-generated method stub
		return basePrice+deliveryCharge;
	}

	@Override
	public String getCategory() {
		// TODO Auto-generated method stub
		return "Non-Veg";
	}

	@Override
	public int getPreparationTime() {
		// TODO Auto-generated method stub
		return 15;
	}
	
}
