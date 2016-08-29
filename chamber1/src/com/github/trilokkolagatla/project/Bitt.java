package com.github.trilokkolagatla.project;

import java.util.Scanner;

public class Bitt {
	public String returnbit(int num){
		int rem;
		String str2 = "";

		char hex[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };

		while (num > 0) {
			rem = num % 16;
			str2 = hex[rem] + str2;
			num = num / 16;
		}
		System.out.println(" Decimal to hexadecimal: " + str2);
		return str2;
		
		
	}
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a decimal number : ");
		int num = input.nextInt();
		Bitt b=new Bitt();
		b.returnbit(num);
		
	}
}
