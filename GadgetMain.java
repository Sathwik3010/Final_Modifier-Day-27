package com.codegnan.abstraction;

import java.util.Scanner;

public class GadgetMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String type = sc.next();
		
		Gadget gadget;
		
		if(type.equalsIgnoreCase("Phone")) {
			gadget = new Phone();
		} else {
			gadget = new Laptop();
		}
		
		System.out.println(gadget.getUse());
		sc.close();
	}

}
