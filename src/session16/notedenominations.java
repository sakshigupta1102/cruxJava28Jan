package session16;
public class notedenominations {
	public static void main(String[] args) {
		note(0, 50, "");
	}
	public static void note(int curr, int end, String ans) {
		if (curr == end) {
			System.out.println(ans);
			return;
		}
		if (curr > end) {
			return;
		}
		note(curr + 10, end, ans + "10 ");
		note(curr + 20, end, ans + "20 ");
		note(curr + 50, end, ans + "50 ");
	}
}
