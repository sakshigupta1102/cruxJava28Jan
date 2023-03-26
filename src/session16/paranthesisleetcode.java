package session16;

public class paranthesisleetcode {
	public static void main(String[] args) {
		generatepara(3, 0, 0, "");
	}

	public static void generatepara(int n, int open, int close, String ans) {
		if (open == n && close == n) {
			System.out.println(ans);
			return;
		}
		if (open > n || close > open) {
			return;
		}
		generatepara(n, open + 1, close, ans + "(");
		generatepara(n, open, close + 1, ans + ")");

	}
}
