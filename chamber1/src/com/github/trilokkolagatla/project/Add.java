package com.github.trilokkolagatla.project;

import java.util.*;

public class Add {
	public int returncube(int n) {
		int cube, sum = 0, i = 1;

		
		while (i <= n) {
			cube = i * i * i;
			sum = sum + cube;
			i++;
		}

//		System.out.println("sum of cubes of natural no" + sum);
		return sum;

	}

	public static void main(String[] args) {
		Add add=new Add();
		int n;
		System.out.print("Enter the value for n:");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
       add.returncube(n);
       

	}

}
