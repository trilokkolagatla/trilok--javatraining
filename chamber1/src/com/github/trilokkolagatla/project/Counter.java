package com.github.trilokkolagatla.project;

import java.util.Scanner;

public class Counter {
	public int returnCounter(int counter){
		int lower, upper, counter1, result;
		System.out.println("enter the value of lower:");
		Scanner sc=new Scanner(System.in);
		lower=sc.nextInt();
		System.out.println("enter the value of upper:");
		Scanner sc1=new Scanner(System.in);
		upper=sc1.nextInt();
		System.out.println("enter the counter value:");
		Scanner sc2=new Scanner(System.in);
		counter1=sc2.nextInt();
		sc.close();
		if (counter1>=lower && counter1<=upper) {
			if (counter1 == 0) {
				result = lower;
				System.out.println(result);
				return result;
			} 
			else {
				result = counter1 + 1;
				System.out.println(result);
			return result;
			}
		} else {
			System.out.println("not in range");
			return 0;
		}
		}

	public static void main(String args[]){
		Counter c=new Counter();
		c.returnCounter(4);
	}
	}
		