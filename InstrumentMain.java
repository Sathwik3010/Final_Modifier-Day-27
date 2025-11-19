package com.codegnan.abstraction;

import java.util.Scanner;

public class InstrumentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String type = sc.next();
		
		Instrument instrument;
		
		if(type.equalsIgnoreCase("Guitar")) {
			instrument = new Guitar();
		} else {
			instrument = new Drum();
		}
		System.out.println(instrument.getSound());
		sc.close();
	}

}
