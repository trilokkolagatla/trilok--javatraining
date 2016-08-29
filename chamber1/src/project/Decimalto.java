package project;

import java.util.Scanner;

import java.util.Stack;

public class Decimalto {
	public int convertBinary(int num) {
		int binary[] = new int[40];
		int index = 0;
		while (num > 0) {
			binary[index++] = num % 2;
			num = num / 2;
		}
		for (int i = index - 1; i >= 0; i--) {
			System.out.print(binary[i]);
		}
		return 1;
	}

	public static void main(String a[]) {
		Decimalto obj = new Decimalto();
		System.out.println("Binary representation of decimal: ");
		obj.convertBinary(89);

	}
}
