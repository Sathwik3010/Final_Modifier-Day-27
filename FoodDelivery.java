package com.codegnan.abstraction;

public class FoodDelivery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Fooditem f1 = new Pizza("FarmHouse",300,"large");
//		f1.display();
//		System.out.println(f1.getCategory());
//		System.out.println(f1.getPreparationTime());
//		System.out.println(f1.calculateTotalPrice());
		
		Fooditem[] items = new Fooditem[6];
		items[0]=new Pizza("FarmHouse",300,"large");
		items[1]=new ChickenBurger("Grilled Chiken Burger",100);
		items[2]=new CoolDrink("pepsi",50);
		items[3]=new Pizza("Panenr tikka",280,"medium");
		items[4]=new ChickenBurger("Zinger Burger",200);
		items[5]=new CoolDrink("sprite",60);

		for(int i=0;i<items.length;i++) {
			items[i].display();
			System.out.println("Category: "+items[i].getCategory());
			System.out.println("Preperation Time: "+items[i].getPreparationTime());
			System.out.println("Total Price: "+items[i].calculateTotalPrice());
			System.out.println("=========================");
			System.out.println();
		}
	}

}
