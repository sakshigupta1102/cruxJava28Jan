package session10;

public class insertionsort {
	public static void main(String[] args) {
		int[] arr = { 5, 4, 8, 1, 2 };
		for (int i = 1; i < arr.length; i++) {
			int temp = arr[i];
			int j = i - 1;
			while (j >= 0 && temp < arr[j]) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = temp;

		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + "  ");
		}

	}
}
