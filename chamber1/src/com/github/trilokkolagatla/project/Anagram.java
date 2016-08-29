package com.github.trilokkolagatla.project;

import java.util.*;
import java.lang.*;

public class Anagram {
	public static boolean isAnagram(String s1, String s2) {

		String copyOfs1 = s1.replaceAll("\\s", "");
		String copyOfs2 = s2.replaceAll("\\s", "");
		boolean status = true;
		if (copyOfs1.length() != copyOfs2.length()) {
			status = false;
		} else {
			char[] s1Array = copyOfs1.toLowerCase().toCharArray();
			char[] s2Array = copyOfs2.toLowerCase().toCharArray();
			Arrays.sort(s1Array);
			Arrays.sort(s2Array);
			status = Arrays.equals(s1Array, s2Array);

		}
		if (status) {
			System.out.println(s1 + " and " + s2 + " are anagrams");
			return true;
		} else {
			System.out.println(s1 + " and " + s2 + " are not anagrams");
			return false;
		}
	}

	public static void main(String[] args) {
		Anagram def = new Anagram();
		String s1=" ",s2=" ";
		
		System.out.println("enter string s1:");
		Scanner sc=new Scanner(System.in);
		s1=sc.next();
		System.out.println("enter string s2:");
		Scanner sc1=new Scanner(System.in);
		s2=sc1.next();
		Anagram.isAnagram(s1,s2);
	}
}
