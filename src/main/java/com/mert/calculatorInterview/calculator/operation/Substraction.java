package com.mert.calculatorInterview.calculator.operation;

public class Substraction implements OperationInterface {

	@Override
	public Number calculate(Double firstNumber, Double secondNumber) {
		return firstNumber - secondNumber;
	}

	@Override 
	public Number calculate(Integer firstNumber, Integer secondNumber) {
		return firstNumber - secondNumber;
	}

}
