package com.github.trilokkolagatla.project;

public class Vowel {

	private static String s1 = "ASsdef";
	public String s2[] = { "a", "e", "i", "o", "u" };

	public void Constant(String s1) {
		for (int i = 0; i < s1.length(); i++) {
			char c = s1.charAt(i);
			if (c == 'a' || c == 'e'|| c == 'i'|| c == 'o'|| c == 'u'|| c == 'A'|| c == 'E'|| c == 'I'|| c == 'O'|| c == 'U') {
				System.out.println("it is vowel");
			} else {
				System.out.println("it is a consant");
			}
		}

	}

	public static void main(String[] args) {
		Vowel v = new Vowel();
		v.Constant(s1);

	}

}
