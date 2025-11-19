package com.codegnan.abstraction;

import java.util.Scanner;

public class CalcuMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int code = sc.nextInt();
		
		Calculator calc = new Calculator();
		System.out.println(calc.getResult(number, code));
		sc.close();
	}

}
