package com.github.trilokkolagatla.project;

import java.util.Scanner;

public class Check {
	static int x;
	static int y;
	static int z;

	public Check(int x, int y) {
		Check.x = x;
		Check.y = y;
	}

	public static boolean checkequals(int x, int y, int z) {
		boolean bool = false;
		if (x == z & y == z) {
			System.out.println("print its true");
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		int z = scan.nextInt();
		boolean bool = checkequals(x, y, z);
		System.out.println(bool); // print true if either of x and y is equals
									// to z
	}

}
