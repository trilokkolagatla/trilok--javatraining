package com.github.trilokkolagatla.project;

public class binary {
	public int getDecimalFromBinary(int binary) {

		int decimal = 0;
		int power = 0;
		while (true) {
			if (binary == 0) {
				break;
			} else {
				int tmp = binary % 10;
				decimal += tmp * Math.pow(2, power);
				binary = binary / 10;
				power++;
			}
		}
		return decimal;
	}

	public static void main(String a[]) {
		binary bd = new binary();
		System.out.println("result ===> " + bd.getDecimalFromBinary(101));

	}
}