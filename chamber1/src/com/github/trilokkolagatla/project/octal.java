package com.github.trilokkolagatla.project;

import java.util.Scanner;

class octal {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a decimal number : ");
		double num = input.nextDouble();

		double rem;
		String str = "";
		char dig[] = { '0', '1', '2', '3', '4', '5', '6', '7' };

		while (num > 0) {
			rem = num % 8;
			str = dig[(int) rem] + str;
			num = num / 8;
		}
		System.out.println("Decimal to octal: " + str);
	}
}
