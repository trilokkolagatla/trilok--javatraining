package com.junit;

import static org.junit.Assert.*;

import org.junit.Test;

import project.Sroot;

public class SrootTest {

	@Test
	public void postiveTest() {
		Sroot s=new Sroot();
		int actual=(int)Sroot.calculateSqrt(144);
		assertEquals(12, actual);
	}
	@Test
	public void negativeTest() {
		Sroot s=new Sroot();
		int actual=(int)Sroot.calculateSqrt(-1);
		assertEquals(1, actual);
	}


}