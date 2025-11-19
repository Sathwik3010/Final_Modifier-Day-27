package com.codegnan.abstraction;

public class CoolDrink extends Fooditem{

	public CoolDrink(String name, double basePrice) {
		super(name, basePrice);
	}

	@Override
	public double calculateTotalPrice() {
		// TODO Auto-generated method stub
		return basePrice;
	}

	@Override
	public String getCategory() {
		// TODO Auto-generated method stub
		return "Beverages";
	}

	@Override
	public int getPreparationTime() {
		// TODO Auto-generated method stub
		return 2;
	}
	
	
}
