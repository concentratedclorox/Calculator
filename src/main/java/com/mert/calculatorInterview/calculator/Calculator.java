package com.mert.calculatorInterview.calculator;

import java.util.LinkedList;

import com.mert.calculatorInterview.calculator.operation.Addition;
import com.mert.calculatorInterview.calculator.operation.Apply;
import com.mert.calculatorInterview.calculator.operation.Divide;
import com.mert.calculatorInterview.calculator.operation.Multiply;
import com.mert.calculatorInterview.calculator.operation.OperationInterface;
import com.mert.calculatorInterview.calculator.operation.Substraction;

/**
 * 
 * @author Mert
 * 
 */
public class Calculator {

	private final OperationInterface divide = new Divide();
	private final OperationInterface multiply = new Multiply();
	private final OperationInterface substraction = new Substraction();
	private final OperationInterface addition = new Addition();
	private final Apply apply = new Apply();

	private LinkedList<String> operationInList;
	private Number mainResult;

	public Calculator(LinkedList<String> commandList) throws InvalidCommandException {
		this.operationInList = commandList;
		this.calculation();
	}

	private Number calculation() throws InvalidCommandException {
		if (operationInList.peekLast().toLowerCase().contains("apply")) {
			String line = operationInList.pollLast();
			String[] splitted = line.split(" ");
			if (splitted.length != 2) {
				throw new InvalidCommandException();
			}
			mainResult = apply.apply(splitted[1]);

			for (String operations : operationInList) {
				String[] splittedOperator = operations.split(" ");
				if (splittedOperator.length != 2)
					throw new InvalidCommandException();

				Number number = null;
				if (splittedOperator[1].contains("."))
					number = Double.valueOf(splittedOperator[1]);
				else
					number = Integer.valueOf(splittedOperator[1]);

				switch (splittedOperator[0].toLowerCase()) {
				case "add":
					mainResult = runOperation(addition, mainResult, number);
					break;
				case "multiply":
					mainResult = runOperation(multiply, mainResult, number);
					break;
				case "divide":
					mainResult = runOperation(divide, mainResult, number);
					break;
				case "substract":
					mainResult = runOperation(substraction, mainResult, number);
					break;
				default:
					throw new InvalidCommandException();
				}

			}
		}
		return mainResult;
	}

	private Number runOperation(OperationInterface operation, Number num1, Number num2) {
		if (num1 instanceof Double || num2 instanceof Double) {
			return operation.calculate(num1.doubleValue(), num2.doubleValue());
		}
		return operation.calculate(num1.intValue(), num2.intValue());

	}

	public Number getMainResult() {
		return mainResult;
	}

}
