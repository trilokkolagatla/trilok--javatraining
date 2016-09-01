package com.github.trilokkolagatla.project;

import java.util.Scanner;

public class Fiboo {
	public static void main(String args[]) {
		int i=0,f=0,f1=0,f2=1,n;
		System.out.println("enter the value of n");
		Scanner sc=new Scanner (System.in);
		n=sc.nextInt();
		sc.close();
		System.out.println(f);
		for(i=0;i<n;i++){
			System.out.println(f2);
			f=f1;
			f1=f2;
			f2=f+f1;
		}
	}

}
