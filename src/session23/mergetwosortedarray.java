package session23;

public class mergetwosortedarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { 4, 6, 8, 9, 12 };
		int[] arr2 = { 7, 9, 20, 30, 40, 50, 60, 80 };
		int[] ans = mergetwosortedarray(arr1, arr2);
		for (int a : ans) {
			System.out.println(a+" ");
		}

	}

	public static int[] mergetwosortedarray(int[] arr1, int[] arr2) {
		int[] ans = new int[arr1.length + arr2.length];
		int i = 0;
		int j = 0;
		int k = 0;
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] < arr2[j]) {
				ans[k] = arr1[i];
				i++;
				k++;
			} else {
				ans[k] = arr2[j];
				k++;
				j++;
			}
		}
		while (i < arr1.length) {
			ans[k] = arr1[i];
			i++;
			k++;
		}
		while (j < arr2.length) {
			ans[k] = arr2[j];
			j++;
			k++;
		}
		return ans;

	}

}
