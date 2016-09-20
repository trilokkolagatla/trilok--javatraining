package com.github.trilokkolagatla.project;

public class SumofDigits {
	private static int n1 = 543;

	public void returnnumber(int n1) {
		int remainder;
		int sum = 0;

		while (n1 != 0) {
			remainder = n1 % 10;
			n1 = n1 / 10;
			sum = sum + remainder;
		}
		System.out.println(sum);

	}

	public static void main(String[] args) {
		SumofDigits s = new SumofDigits();
		s.returnnumber(n1);
	}


}
