package session22;

import java.util.ArrayList;

public class palinpart {
	public static void main(String[] args) {
		ArrayList<ArrayList<String>> fans = new ArrayList();
		palpartitioning("nitin", new ArrayList<String>(), fans);
		System.out.println(fans);
	}
	public static void palpartitioning(String ques, ArrayList<String> ans,
			ArrayList<ArrayList<String>> fans) {
		if (ques.length() == 0) {
			fans.add(new ArrayList<String>(ans));
			return;
		}
		for (int i = 1; i <= ques.length(); i++) {
			String s = ques.substring(0, i);
			String ros = ques.substring(i);
			if (ispal(s)) {
				ans.add(s);
				palpartitioning(ros, ans, fans);
				ans.remove(ans.size() - 1);
			}
		}
	}

	public static void partprint(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		for (int i = 1; i <= ques.length(); i++) {
			String s = ques.substring(0, i);
			String ros = ques.substring(i);
			partprint(ros, ans + s + "|");
		}
	}

	public static void palpartprint(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		for (int i = 1; i <= ques.length(); i++) {
			String s = ques.substring(0, i);
			String ros = ques.substring(i);
			if (ispal(s))
				palpartprint(ros, ans + s + "|");
		}
	}

	public static boolean ispal(String str) {
		int i = 0;
		int j = str.length() - 1;
		while (i < j) {
			char ch1 = str.charAt(i);
			char ch2 = str.charAt(j);
			if (ch1 != ch2)
				return false;
			i++;
			j--;
		}
		return true;
	}

}
