package com.codegnan.abstraction;

class Calculator {

	public final int Factor = 2;

	public final int getResult(int num, int code) {
		Operation op;

		switch (code) {
		case 1:
			op = new MultiplyOperation();
			break;
		case 2:
			op = new DivideOperation();
			break;
		default:
			return -1;
		}

		return op.compute(num, Factor);
	}
}
