package com.junit;

import static org.junit.Assert.*;

import org.junit.Test;

import project.binary;

public class binaryTest {

	@Test
	public void postiveTest() {
		binary bd=new binary();
		int actual =bd.getDecimalFromBinary(111);
		assertEquals(7, actual);
	}
	@Test
	public void negativeTest() {
		binary bd=new binary();
		int actual =bd.getDecimalFromBinary(0);
		assertEquals(0, actual);
	}
}
