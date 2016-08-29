package com.junit;

import static org.junit.Assert.*;

import org.junit.Test;

import project.Natural;

public class NaturalTest {

	@Test
	public void postiveTest() {
		Natural natural = new Natural();
		int actual = natural.returnsum(3);
		int expected = 6;
		assertEquals(expected, actual);
	}
	
	@Test
	public void zerotest1() {
		Natural natural = new Natural();
		int actual = natural.returnsum(0);
		int expected = 0;
		assertEquals(expected, actual);
	}
	@Test
	public void negativeTest1() {
		Natural natural = new Natural();
		int actual = natural.returnsum(-1);
		int expected = 0;
		assertEquals(0, actual);
	}
}
