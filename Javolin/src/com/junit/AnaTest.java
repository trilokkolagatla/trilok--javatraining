package com.junit;

import static org.junit.Assert.*;

import java.math.BigInteger;
import java.util.ArrayList;

import org.junit.Test;

import project.Ana;
import project.Anagram;

public class AnaTest {

	@Test
	public void postiveTest() {

		Ana obj=new Ana();
		ArrayList<BigInteger> list= obj.generateAnagrams("","123");
		assertEquals(321,list);
	}
}
