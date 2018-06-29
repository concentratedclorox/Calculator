package com.mert.calculatorInterview.calculator.operation;

public class Divide implements OperationInterface {

	@Override
	public Number calculate(Double firstNumber, Double secondNumber) {
		return firstNumber / secondNumber;

	}

	@Override
	public Double calculate(Integer firstNumber, Integer secondNumber) {
		if (secondNumber == 0) {
			throw new IllegalArgumentException("Argument 'divisor' is 0");
		}
		return firstNumber.doubleValue() / secondNumber.doubleValue();
	}

}
