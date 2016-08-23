package com.junit;

import static org.junit.Assert.*;

import org.junit.Test;

import project.Factorial;

public class FactorialTest {

	@Test
	public void positiveTest() {
		Factorial factorial = new Factorial();
		double actualValue = factorial.returnFactorial(3);
		assertEquals(6.0, actualValue, 0.001);
	}
	
	@Test
	public void zeroTest() {
		Factorial factorial = new Factorial();
		double actualValue = factorial.returnFactorial(0);
		assertEquals(0.0, actualValue, 0.001);
	}
	
	@Test
	public void negativeNumberTest() {
		Factorial factorial = new Factorial();
		double actualValue = factorial.returnFactorial(-1);
		assertEquals(0.0, actualValue, 0.001);
	}
	
	@Test
	public void negativeNumberTest2() {
		Factorial factorial = new Factorial();
		double actualValue = factorial.returnFactorial(24);
		assertEquals(0.0, actualValue, 0.001);
	}
	
}
