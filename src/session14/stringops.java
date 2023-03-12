package session14;

public class stringops {
	public static void main(String[] args) {
		// System.out.println(reverse("welcome"));
		// System.out.println(ispal("nitvin"));
	//	System.out.println("xyz".substring(0, 0));
		substrings("abcd");
	}

	public static String reverse(String str) {
		String ans = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			char ch = str.charAt(i);
			ans += ch;
		}
		return ans;
	}

	public static boolean ispal(String str) {
		int i = 0;
		int j = str.length() - 1;
		while (i < j) {
			char ch1 = str.charAt(i);
			char ch2 = str.charAt(j);
			if (ch1 != ch2) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

	public static void substrings(String str) {
		for (int i = 0; i < str.length(); i++) {
			for (int j = i+1; j <= str.length(); j++) {
				System.out.println(str.substring(i, j));
			}
		}
	}

}
