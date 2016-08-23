package com.junit;

import static org.junit.Assert.*;

import org.junit.Test;

import project.Anagram;

public class AnagramTest {

	@Test
	public void postiveTest() {

		Anagram anagram = new Anagram();
		boolean s1 = anagram.isAnagram("dube", "bude");
		assertEquals(true, s1);
	}

	@Test
	public void negativeTest() {

		Anagram anagram = new Anagram();
		boolean s1 = anagram.isAnagram("aube", "bude");
		assertEquals(false, s1);
	}

}
