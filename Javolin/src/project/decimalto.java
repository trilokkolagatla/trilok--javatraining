package project;

import java.util.Scanner;
import java.util.Stack;

public class decimalto {
	public static void main(String[] args) 
	  { 
	    Scanner in = new Scanner(System.in);
	
	    Stack<Integer> deci = new Stack<Integer>(); 
	    System.out.println("Enter decimal number: ");
	    int num = in.nextInt();
	 
	    while (num != 0)
	    {
	      int d = num % 2;
	      deci.push(d);
	      num /= 2;
	    } 
	 
	    System.out.print("\nBinary representation is:");
    while (!(deci.isEmpty() ))
    {
      System.out.print(deci.pop());
    }
    System.out.println();
  }
}

