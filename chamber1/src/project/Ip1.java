package project;
import java.lang.*;

public class Ip1 {

	private static String ipadress = "194.167.3.5";

	public long ipaddresstodecimal(String ipadress) {
		long converted = 0;
		String[] ipadressofarray = ipadress.split("\\.");
		System.out.println(ipadressofarray[0]);
		for (int i=3; i>=0; i--) {
			long ip = Long.parseLong(ipadressofarray[3-i]);
			converted |= ip << (8 *i);
			System.out.println(+converted);
		}
		return converted;

	}

	public static void main(String[] args) {
		Ip1 get = new Ip1();
		get.ipaddresstodecimal(ipadress);
	}

}