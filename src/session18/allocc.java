package session18;

public class allocc {

	public static void main(String[] args) {
		int[] arr = { 2, 3, 6, 9, 8, 3, 2, 3, 6, 4 };
		int[] ans = allocc(arr, 0, 3, 0);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}
	}

	public static int[] allocc(int[] arr, int idx, int item, int cnt) {
		if (arr.length == idx) {
			return new int[cnt];
		}

		if (arr[idx] == item) {
			int[] rr = allocc(arr, idx + 1, item, cnt + 1);
			rr[cnt] = idx;
			return rr;
		} else {
			int[] rr = allocc(arr, idx + 1, item, cnt);
			return rr;
		}

	}

}
