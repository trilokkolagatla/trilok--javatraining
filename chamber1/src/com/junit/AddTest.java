package com.junit;

import static org.junit.Assert.*;

import org.junit.Test;

import project.Add;

public class AddTest {

	@Test
	public void postiveTest() {
		Add add=new Add();
		int num =add.returncube(2);
		assertEquals(9,num);
	}

}
