package com.github.trilokkolagatla.project;

import static org.junit.Assert.*;

import org.junit.Test;

import com.github.trilokkolagatla.project.Decimal;

import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;

public class DecimalTest {
	
//i-inverse relation and postive test are same
	@Test
	public void postiveTest() {
		Decimal d = new Decimal();
		int actual = d.returnreverse(45);
		assertEquals(54, actual);
	}
//b-boundary conditions
	@Test 
	public void zerovalueTest() {
		Decimal d = new Decimal();
		try{
			d.returnreverse(0);
		}catch(IllegalArgumentException e){
			fail("enter postive numbers");
		}
	}

	// e-error condition
	@Test
	public void NegativeTest() {
		try {
			Decimal d = new Decimal();
			d.returnreverse(-56);
		} catch (IllegalArgumentException e) {
			fail("enter natural numbers");
		}
	}
	@Test
	public void inverseTest() {
		Decimal d = new Decimal();
		int actual = d.rmethod(89);
		assertEquals(89, actual);
	}


}
