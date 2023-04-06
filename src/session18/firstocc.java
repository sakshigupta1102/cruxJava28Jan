package session18;

public class firstocc {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 2, 3, 6, 7, 2, 4 };
		System.out.println(firstocc(arr, 0, 10));

	}

	public static int firstocc(int[] arr, int idx, int search) {
		if (arr.length == idx) {
			return -1;
		}
		if (arr[idx] == search) {
			return idx;
		}
	
		return firstocc(arr, idx + 1, search);

	}

}
