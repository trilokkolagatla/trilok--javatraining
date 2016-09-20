package com.github.trilokkolagatla.project;

public class BinarySum {
	static String s1 = "1010";
	static String s2 = "10";

	static int num = Integer.parseInt(s1, 2);
	static int num1 = Integer.parseInt(s2, 2);

	static int sum = num + num1;

	public void add() {
		System.out.println(sum);
	}

	public static void main(String[] args) {
		BinarySum b = new BinarySum();
		b.add();
	}

}
