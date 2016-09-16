package com.github.trilokkolagatla.stringmetrics;

public class James extends Charles implements Denis {
	public static String s1 = "they are pvsm";
	public static String s2 = "they are sop";

	public static void allOf(String s1, String s2) {

		System.out.println(s1);
		System.out.println(s2);
	}

	public static void main(String[] args) {

		James.allOf(s1, s2);
		Charles.thingsOf(s1, s2);
		Denis.detailsOf(s1, s2);

	}
}
