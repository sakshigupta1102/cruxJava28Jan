package session16;

public class climb {

	public static void main(String[] args) {
		climb(0, 4, "");
	}

	public static void climb(int curr, int end, String ans) {
		if (curr == end) {
			System.out.println(ans);
			return;
		}
		if (curr > end) {
			return;
		}

		climb(curr + 1, end, ans + "1");
		climb(curr + 2, end, ans + "2");
		climb(curr + 3, end, ans + "3");

	}
}
