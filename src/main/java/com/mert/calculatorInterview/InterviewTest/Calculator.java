package com.mert.calculatorInterview.InterviewTest;

import java.util.LinkedList;
import java.util.Stack;
import java.util.function.Function;

/**
 * 
 * @author Mert
 * 
 */
public class Calculator {

	private static final String APPLY = "APPLY";

	private final Function<Integer, Function<Integer, Integer>> sum = x -> y -> x + y;
	private final Function<Integer, Function<Integer, Integer>> div = x -> y -> x / y;
	private final Function<Integer, Function<Integer, Integer>> sub = x -> y -> x - y;
	private final Function<Integer, Function<Integer, Integer>> mul = x -> y -> x * y;

	private LinkedList<String> operationInList;
	private Integer mainResult;

	public Calculator(LinkedList<String> commandList) {
		this.operationInList = commandList;
		this.calculation();
	}

	private int calculation() {
		if (operationInList.peekLast().toLowerCase().contains("apply")) {
			String line = operationInList.pollLast();
			String[] splitted = line.split(" ");
			mainResult = Integer.valueOf(splitted[1]);

			for (String operations : operationInList) {
				String[] splittedOperator = operations.split(" ");

				switch (splittedOperator[0].toLowerCase()) {
				case "add":
					mainResult = calculate(sum, mainResult, Integer.valueOf(splittedOperator[1]));
					break;
				case "multiply":
					mainResult = calculate(mul, mainResult, Integer.valueOf(splittedOperator[1]));
					break;
				case "divide":
					mainResult = calculate(div, mainResult, Integer.valueOf(splittedOperator[1]));
					break;
				case "substract":
					mainResult = calculate(div, mainResult, Integer.valueOf(splittedOperator[1]));
					break;
				default:
					break;
				}
			}

		}
		return mainResult;
	}

	private int calculate(Function<Integer, Function<Integer, Integer>> abc, Integer args, Integer args2) {
		return abc.apply(args).apply(args2);
	}

	public Integer getMainResult() {
		return mainResult;
	}

}
