package com.github.trilokkolagatla.project;

import java.util.*;

public class squareroot {
	public static void main(String[] args) {
		int i;
		Scanner in = new Scanner(System.in);
		System.out.printf("Enter i Value:  ");
		i = in.nextInt();
		squareroot s=new squareroot();
		s.findSquareRoot(i);
	}

	public int findSquareRoot(double number) {
		boolean isPositiveNumber = true;
		double g1;
		double squareRoot = number / 2;
		do {
			g1 = squareRoot;
			squareRoot = (g1 + (number / g1)) / 2;
		} while ((g1 - squareRoot) != 0);

		if (isPositiveNumber) {
			System.out.println("the Square root of " + number + " is ");
			System.out.println(squareRoot);
		} else {
			System.out.println("+" + squareRoot + " i");
		}
		return (int) number;
	}
}
