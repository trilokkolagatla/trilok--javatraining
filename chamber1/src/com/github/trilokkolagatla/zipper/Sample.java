package com.github.trilokkolagatla.zipper;

import java.util.*;

public class Sample {

	public static void main(String args[])
	{
		int max,min;
		System.out.println("enter the value of max:");
		Scanner sc=new Scanner(System.in);
		max=sc.nextInt();
	    System.out.println("enter the value of min:");
	    Scanner sc1=new Scanner(System.in);
	    min=sc1.nextInt();
	    int diff=(max-min);
	    Random rn = new Random();
	    int i = rn.nextInt(diff+1);
	    i+=min;
	    System.out.print("The Random Number is " + i);
}
}