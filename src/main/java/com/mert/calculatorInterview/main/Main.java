package com.mert.calculatorInterview.main;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Paths;

import com.mert.calculatorInterview.calculator.InvalidCommandException;
import com.mert.calculatorInterview.service.CalculatorService;

public class Main {

	public static void main(String[] args) throws IOException, URISyntaxException, InvalidCommandException {
		CalculatorService serv = new CalculatorService("Example2");
		System.out.println(serv.getResult());
	}

}
