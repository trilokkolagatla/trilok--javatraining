package com.junit;

import static org.junit.Assert.*;

import org.junit.Test;

import project.Decimal;

public class DecimalTest {

	@Test
	public void postiveTest() {
		Decimal d=new Decimal();
		int actual=d.returnreverse(45);
		assertEquals(54, actual);
	}
	@Test
	public void negativeTest() {
		Decimal d=new Decimal();
		int actual=d.returnreverse(-43);
		assertEquals(0, actual);
	}


}
