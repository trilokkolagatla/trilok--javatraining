package com.github.trilokkolagatla.project;

public class Golden {
	public static double returnno(int n) {
		if (n == 0)
			return 1;
		else
			return 1.0 + 1.0 / returnno(n - 1);
	}
	public static void main(String[] args) {
       Golden g=new Golden();
       Golden.returnno(5);
	   System.out.println("enter the result");
	}
}