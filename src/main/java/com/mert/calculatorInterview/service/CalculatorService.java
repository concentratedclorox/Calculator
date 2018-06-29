package com.mert.calculatorInterview.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URISyntaxException;
import java.nio.file.Paths;
import java.util.LinkedList;

import com.mert.calculatorInterview.calculator.Calculator;
import com.mert.calculatorInterview.calculator.InvalidCommandException;
import com.mert.calculatorInterview.io.Reader;

public class CalculatorService {

	private Calculator calc;
	private LinkedList<String> commandList = new LinkedList<>();

	public CalculatorService(String path) throws IOException, URISyntaxException, InvalidCommandException {

		

		this.commandList = Reader.read(path);
		if (operationValidityCheck(commandList)) {
			this.calc = new Calculator(commandList);
		} else {
			throw new InvalidCommandException();
		}

	}

	public Number getResult() {
		return this.calc.getMainResult();
	}

	private boolean operationValidityCheck(LinkedList<String> commandList) {
		return commandList.peekLast().toLowerCase().contains("apply");
	}
}
