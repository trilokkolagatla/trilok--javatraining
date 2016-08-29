package com.github.trilokkolagatla.project;

import java.util.Scanner;

public class Cube {
	public static double returnCube(double cube){
		 double cbrt = Math.cbrt(cube);
	        System.out.println("Cube root of " + cube + " is " + cbrt);
       return cbrt;		
	}
	
	public static void main(String[] args) {
        double cube;
        Cube cb=new Cube();
        System.out.println("enter the value of cube:");
        Scanner sc=new Scanner(System.in);
        cube=sc.nextDouble();
       
        cb.returnCube(cube);
       
    }


}
