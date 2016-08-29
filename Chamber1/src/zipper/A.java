package zipper;

public class A {
	private final static String BASE64 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/=";

	public String decode(String string) {
		String decoded = "";
		int paddingLength = 0;
		String pad = string.charAt(string.length() - 1) == '=' ? "A" : " ";
		if (pad.length() > 0) {
			pad = pad + (string.charAt(string.length() - 2) == '=' ? "A" : " ");
		}
		paddingLength = pad.length();
		string = string.substring(0, string.length() - paddingLength) + pad;
		for (int i = 0; i < string.length(); i = i + 4) {
			int n = (BASE64.indexOf(string.charAt(i)) << 18) + (BASE64.indexOf(string.charAt(i)) << 12)
					+ (BASE64.indexOf(string.charAt(i + 2)) << 6) + (BASE64.indexOf(string.charAt(i + 3)));
			decoded = decoded + "" + (char) (n >> 16 & 0xff) + (char) (n >> 8 & 0xff) + (char) (n & 0xff);
		}
		return decoded.substring(0, decoded.length() - paddingLength);
	}

	public static void main(String[] args) {
		A b = new A();
		System.out.println(b.decode("Q==="));
	}
}