package com.github.trilokkolagatla.project;

import java.util.Scanner;

public class swap {
	public int returnswap(int a, int b) {
		if (a == b) {
			return 0;
		} else {
			a = a ^ b;
			b = a ^ b;
			a = a ^ b;
			System.out.println("After swapping:");
			System.out.println("A=" + a);
			System.out.println("B=" + b);
		}
		return 1;
	}

	public static void main(String args[]) {
		int a, b;
		System.out.println("Before swapping:");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		sc.close();
		System.out.println("A=" + a);
		Scanner sc1 = new Scanner(System.in);
		b = sc1.nextInt();
		sc1.close();
		System.out.println("B=" + b);

	}
}
