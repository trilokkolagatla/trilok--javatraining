package com.github.trilokkolagatla.project;
import java.util.*;
import java.math.*;
public class power {
	public static void main(String args[]) {
		
		double sum=0;
		double n;
		System.out.println("enter the value of n:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextDouble();
		for(double i=1;i<=n;i++)
		{
			sum=sum+Math.pow(2.0,i);
			System.out.println(sum);
			
		}
		System.out.println(sum);
	}
	
}
	