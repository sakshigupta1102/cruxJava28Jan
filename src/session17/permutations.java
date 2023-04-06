package session17;

public class permutations {
	public static void main(String[] args) {
		perm("aab", "");
	}

	public static void perm(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		for (int i = 0; i < ques.length(); i++) {
			char ch = ques.charAt(i);
			String ros = ques.substring(0, i) + ques.substring(i + 1);
			perm(ros, ans + ch);

		}

	}
}
