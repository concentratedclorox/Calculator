package com.mert.calculatorInterview.InterviewTest;

import java.io.IOException;
import java.net.URISyntaxException;

import org.junit.Assert;
import org.junit.Test;

import com.mert.calculatorInterview.calculator.InvalidCommandException;
import com.mert.calculatorInterview.service.CalculatorService;

public class ValidityTest {

	@Test
	public void Example1() throws IOException, URISyntaxException, InvalidCommandException {

		CalculatorService serv = new CalculatorService("Example1");
		Assert.assertEquals(18, serv.getResult());
	}

	@Test
	public void Example2() throws IOException, URISyntaxException, InvalidCommandException {

		CalculatorService serv = new CalculatorService("Example2");
		Assert.assertEquals(90.0, serv.getResult());
	}

	@Test
	public void Example3() throws IOException, URISyntaxException, InvalidCommandException {

		CalculatorService serv = new CalculatorService("Example3");
		Assert.assertEquals(1, serv.getResult());
	}

	@Test
	public void Example4() throws IOException, URISyntaxException, InvalidCommandException {

		CalculatorService serv = new CalculatorService("Example4");
		Assert.assertEquals(7, serv.getResult());
	}

	@Test(expected = InvalidCommandException.class)
	public void ExampleInvalid1() throws IOException, URISyntaxException, InvalidCommandException {
		CalculatorService serv = new CalculatorService("ExampleInvalid1");
		Assert.assertEquals(90.0, serv.getResult());
	}

	@Test(expected = InvalidCommandException.class)
	public void ExampleInvalid2() throws IOException, URISyntaxException, InvalidCommandException {
		CalculatorService serv = new CalculatorService("ExampleInvalid2");
		Assert.assertEquals(90.0, serv.getResult());
	}

	@Test(expected = InvalidCommandException.class)
	public void ExampleInvalid3() throws IOException, URISyntaxException, InvalidCommandException {
		CalculatorService serv = new CalculatorService("ExampleInvalid3");
		Assert.assertEquals(90.0, serv.getResult());
	}

	@Test(expected = InvalidCommandException.class)
	public void ExampleInvalid4() throws IOException, URISyntaxException, InvalidCommandException {
		CalculatorService serv = new CalculatorService("ExampleInvalid4");
		Assert.assertEquals(90.0, serv.getResult());
	}

	@Test(expected = InvalidCommandException.class)
	public void ExampleInvalid5() throws IOException, URISyntaxException, InvalidCommandException {
		CalculatorService serv = new CalculatorService("ExampleInvalid5");
		Assert.assertEquals(90.0, serv.getResult());
	}

	@Test(expected = InvalidCommandException.class)
	public void ExampleInvalid6() throws IOException, URISyntaxException, InvalidCommandException {
		CalculatorService serv = new CalculatorService("ExampleInvalid6");
		Assert.assertEquals(90.0, serv.getResult());
	}

	@Test(expected = InvalidCommandException.class)
	public void ExampleInvalid7() throws IOException, URISyntaxException, InvalidCommandException {
		CalculatorService serv = new CalculatorService("ExampleInvalid7");
	}

}
