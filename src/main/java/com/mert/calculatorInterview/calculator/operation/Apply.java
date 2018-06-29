package com.mert.calculatorInterview.calculator.operation;

public class Apply {

	public Apply() {
	}

	public Number apply(String splitted) {
		System.out.println(splitted.contains("."));
		if (splitted.contains("."))
			return Double.valueOf(splitted);
		return Integer.valueOf(splitted);
	}

}
