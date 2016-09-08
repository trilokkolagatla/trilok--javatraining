package com.github.trilokkolagatla.project;

import static org.junit.Assert.*;

import org.junit.Test;

import com.github.trilokkolagatla.project.ReverseNumber;

import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;

public class ReverseNumberTest {
	
//i-inverse relation and postive test are same
	@Test
	public void postiveTest() {
		ReverseNumber d = new ReverseNumber();
		int actual = d.returnreverse(45);
		assertEquals(54, actual);
	}
//b-boundary conditions
	@Test 
	public void zerovalueTest() {
		ReverseNumber d = new ReverseNumber();
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
			ReverseNumber d = new ReverseNumber();
			d.returnreverse(-56);
		} catch (IllegalArgumentException e) {
			fail("enter natural numbers");
		}
	}
	//check by other means
	@Test
	public void inverseTest() {
		ReverseNumber d = new ReverseNumber();
		int actual = d.rmethod(89);
		assertEquals(89, actual);
	}


}
