package com.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import zipper.*;

public class Address {
	@Test
	public void postiveTest() {

		Address ad = new Address();
		string s1 = ad.setaddress("43");
		assertEquals(true, s1);
	}

	private string setaddress(String string) {
		// TODO Auto-generated method stub
		return null;
	}


}
