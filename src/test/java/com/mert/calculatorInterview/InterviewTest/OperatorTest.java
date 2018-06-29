package com.mert.calculatorInterview.InterviewTest;

import java.io.IOException;
import java.net.URISyntaxException;

import org.junit.Assert;
import org.junit.Test;

import com.mert.calculatorInterview.calculator.InvalidCommandException;
import com.mert.calculatorInterview.service.CalculatorService;

public class OperatorTest {

	@Test
	public void Divide1() throws IOException, URISyntaxException, InvalidCommandException {
		CalculatorService serv = new CalculatorService("Divide1");
		Assert.assertEquals(4.0, serv.getResult().doubleValue(), 0.0);
	}

	@Test
	public void Divide2() throws IOException, URISyntaxException, InvalidCommandException {
		CalculatorService serv = new CalculatorService("Divide2");
		Assert.assertEquals(4.375, serv.getResult().doubleValue(), 0.0);
	}

	@Test(expected = IllegalArgumentException.class)
	public void DivideByZero() throws IOException, URISyntaxException, InvalidCommandException {
		CalculatorService serv = new CalculatorService("DivideBy0");
	}

	@Test(expected = IllegalArgumentException.class)
	public void Divide0By0() throws IOException, URISyntaxException, InvalidCommandException {
		CalculatorService serv = new CalculatorService("Divide0By0");
	}
}
