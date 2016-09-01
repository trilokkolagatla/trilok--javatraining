package com.github.trilokkolagatla.project;

import static org.junit.Assert.*;

import org.junit.Test;

import com.github.trilokkolagatla.project.Addition;

public class AdditionTest {

	@Test
	public void postiveTest() {
		
		Addition add=new Addition();
		int num=add.returnSquare(5);
		assertEquals(55,num);
	}
	@Test
	public void negativeTest() {
		
		Addition add=new Addition();
		int num=add.returnSquare(-5);
		assertEquals(0,num);
	}
	private void numass(int i, int num) {
		// TODO Auto-generated method stub
		
	}

}
