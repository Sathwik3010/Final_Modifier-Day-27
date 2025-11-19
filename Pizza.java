package com.codegnan.abstraction;

public class Pizza extends Fooditem {
	String size;

	public Pizza(String name, double basePrice, String size) {
		super(name, basePrice);
		this.size = size;
	}

	@Override
	public double calculateTotalPrice() {

		double extraCharge = 0;
		if (size != null) {
			switch (size.toLowerCase()) {
			case "small": {
				extraCharge = 50;
				break;
			}
			case "medium": {
				extraCharge = 100;
				break;
			}
			case "large": {
				extraCharge = 200;
				break;
			}
			default: {
				extraCharge = 0;
				break;
			}
		}

		}
		return basePrice + extraCharge;
	}

	@Override
	public String getCategory() {
		// TODO Auto-generated method stub
		return "veg";
	}

	@Override
	public int getPreparationTime() {
		// TODO Auto-generated method stub
		int time=20;
		if(size != null) {
			switch(size.toLowerCase()) {
				case "small":{
					time=15;
					break;
				} case "medium":{
					time=22;
					break;
				}case "large":{
					time=25;
					break;
				}
				default:{
					time=20;
					break;
				}
			}
		}
		return 0;
	}
}
