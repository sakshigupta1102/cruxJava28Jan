package session20;

public class subset1 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3 };
		subset1(arr, "", 0);
	}

	public static void subset1(int[] arr, String ans, int idx) {
		if (idx == arr.length) {
			System.out.println(ans);
			return;
		}
		subset1(arr, ans + arr[idx], idx + 1);
		subset1(arr, ans, idx + 1);

	}

	public static void subset1(int[] arr, int idx, ArrayList<Integer> ans) {

	}
}
