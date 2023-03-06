
public class Validator {

	public static void main(String[] args) {
		// start with AlphaNum, SpecialChar, then do UserName
		char cc = '_';
//		System.out.println(isAlphaNum(cc));
//		System.out.println(isSpecialChar(cc, true));
//		System.out.println(isPrefixChar(cc));
//		System.out.println(isDomainChar(cc));
//		System.out.println(singleAtSign("nickw.pelletier@gmail.com"));
		System.out.println(isUsername(".Nick23"));

	}

	public static boolean isAlphaNum(char c) {

		if (Character.isLetter(c) || Character.isDigit(c)) {

			return true;
		} else
			return false;
	}

	public static boolean isSpecialChar(char c, boolean b) {

		if ((c == '-' || c == '.') || (c == '_' && b == true)) {
			return true;

		} else
			return false;
	}

	public static boolean isPrefixChar(char c) {
		if (((isSpecialChar(c, true) == true) || (isSpecialChar(c, false)) == true) || (isAlphaNum(c) == true)) {
			return true;
		} else
			return false;
	}

	public static boolean isDomainChar(char c) {
		if ((isAlphaNum(c) == true) || (isSpecialChar(c, false) == true)) {
			return true;
		} else
			return false;
	}

	public static boolean singleAtSign(String s) {
		int j = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '@') {
				j++;
			}
		}
		if (j == 1) {
			return true;
		} else
			return false;
	}

	// Username

	public static String isUsername(String s) {

		int x = 0;
		char j = s.charAt(x);
		int v = 0;

		// 7 or less chars
		if (s.length() > 0 && s.length() <= 7) {
			System.out.println("ok");
			v++;
		}

		// is there at least one alphanumeric character
		if ((s.charAt(0) == '.' || s.charAt(0) == '-') && isAlphaNum(s.charAt(1)) == true) {
			System.out.println("yes");
			for (x = 1; x < s.length();) {
				if (isAlphaNum(j) == true || isSpecialChar(j, false) == true) {

				}
			}
		}

		// does it exceed seven characters
		if (v <= 7 && x == s.length() + 1) {
			return s.toLowerCase();
		} else
			return "";
	}
}
