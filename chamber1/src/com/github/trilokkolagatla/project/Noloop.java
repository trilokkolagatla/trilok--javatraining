package com.github.trilokkolagatla.project;

import java.util.Scanner;

import com.sun.prism.paint.Stop;

import javafx.css.StyleableObjectProperty;

public class Noloop {
	private static int i1;

	public void getinteger(int i1) {
		Noloop.i1 = i1;
	}

	public int returnno(int i1) {
		System.out.println(i1);
		return (i1 < 100) ? recfunc(i1 + 1) : 0;
	}

	public int recfunc(int i1) {
		return 0;
	}

	public static void main(String[] args) {
		System.out.println("enter the value");
		Noloop n = new Noloop();
		n.returnno(i1);
	}
}
