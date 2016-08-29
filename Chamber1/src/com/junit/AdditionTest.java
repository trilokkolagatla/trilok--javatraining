package com.junit;

import static org.junit.Assert.*;

import org.junit.Test;

import project.Addition;

public class AdditionTest {

	@Test
	public void postiveTest() {
		
		Addition add=new Addition();
		int num=add.returnSquare(5);
		assertEquals(55,num);
	}

}
