package zipper;

import java.util.*;
import zipper.Address;

public class zippercode {
	public static String Alphabet = "abcdefghijklmnopqrstuvwxyz";
	public static String Number = "0123456789";
	private Map<String, Address> addressMap = new HashMap<>();

	public String randInt() {
		StringBuilder str = new StringBuilder("");
		Random rd = new Random();
		for (int i = 0; i < 4; i++) {
			str = str.append(Alphabet.charAt(rd.nextInt(Alphabet.length())));
		}
		for (int i = 0; i < 4; i++) {
			str = str.append(Alphabet.charAt(rd.nextInt(Number.length())));
		}
		return str.toString();
	}
}
