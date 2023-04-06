package session18;

public class lastocc {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 2, 3, 2, 8 };
		System.out.println(lastocc(arr, 0, 2));
	}

	public static int lastocc(int[] arr, int idx, int search) {
		if (arr.length == idx) {
			return -1;
		}
		int rr = lastocc(arr, idx + 1, search);
		if (rr == -1 && arr[idx] == search) {
			return idx;
		}
		return rr;

	}
}
