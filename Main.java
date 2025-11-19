package com.codegnan.abstraction;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle B = new Bus();
		System.out.println(B.getNoOfWheels());
		Vehicle A = new Auto();
		System.out.println(A.getNoOfWheels());
	}
}
