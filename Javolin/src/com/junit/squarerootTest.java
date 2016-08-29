package com.junit;

import static org.junit.Assert.*;

import org.junit.Test;

import project.squareroot;

public class squarerootTest {

	@Test
	public void postiveTest() {
		squareroot s=new squareroot();
		int actual=s.findSquareRoot(144);
		System.out.println(actual);
		assertEquals(12, actual);
		
		
		
	}

}
