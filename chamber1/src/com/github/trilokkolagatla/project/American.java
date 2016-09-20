package com.github.trilokkolagatla.project;

public class American {

	private static String name = "Aderil";

	public void returnnumber(String name) {
		int length = name.length();

		for (int i = 0; i < length; i++) {
			char character = name.charAt(i);
			int ascii = (int) character;
			System.out.println(character + " = " + ascii);
		}
	}

	public static void main(String[] args) {
		American a = new American();
		a.returnnumber(name);

	}
}
