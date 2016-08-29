package com.junit;

import static org.junit.Assert.*;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import project.Ana;
import project.Anagram;

public class AnaTest {

	@Test
	public void postiveTest() {

		Ana obj=new Ana();
		List<BigInteger> list= obj.generateAnagrams("","12");
		List<Integer> expected = Arrays.asList(12,21);
		assertEquals(expected,list);
	}
}