package session10;

public class rotatearray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4 };
		rotatearray(arr,3);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}

	}

	public static void rotatearray(int[] arr, int k) {
		k = k % arr.length;

		for (int times = 0; times < k;  times++) {
			int save = arr[arr.length - 1];
			for (int i = arr.length - 1; i >= 1; i--) {
				arr[i] = arr[i - 1];
			}
			arr[0] = save;
		}

	}

}
