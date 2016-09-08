package com.github.trilokkolagatla.project;

import java.util.Scanner;
import java.io.*;

public class Decimal {

	public static int n;
	public static int j;

	public void get(int n) {
		Decimal.n = n;
	}

	public int set(int n) {
		return n;
	}

	public void put(int j) {
		Decimal.j = j;
	}

	public int let(int j) {
		return j;
	}

	public int rmethod(int j) {
		if (j < 10) {
			System.out.println(+j);
		} else {
			System.out.println(+j % 10);
			rmethod(j / 10);
		}
		return j;
	}

	public int returnreverse(int n) {
		if (n <= 0) {
			throw new IllegalArgumentException();
		}

		int d = 0;
		while (n != 0) {
			d = d * 10; // 0 , 60
			d = d + n % 10; // 6, 65
			n = n / 10; // 5
		}
		System.out.print(d);
		return d;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.print("enter the number n: ");
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		if (n <= 0) {
			throw new IllegalArgumentException();
		}
		Decimal d = new Decimal();
		d.returnreverse(n);
		System.out.println("\nenter the value of j:");
		Scanner sc = new Scanner(System.in);
		j = sc.nextInt();
		if (j <= 0) {
			throw new IllegalArgumentException();
		}
		d.rmethod(j);
	}
}
