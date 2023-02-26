package session9;

import java.util.Scanner;

public class ararydemo {

	public static void main(String[] args) {
		int[] arr = { -10, -60, -90, -800, -30 };
		display(arr);
		System.out.println("**************************");
		// System.out.println(max(arr));
		// int[] arr = new int[5];
		// Scanner scan = new Scanner(System.in);
		// // input
		// for (int i = 0; i < arr.length; i++) {
		// arr[i] = scan.nextInt();
		// }
		// display(arr);
		//int[] ans = reverse(arr);
	//	display(ans);
		int[] ans = reverse(arr);
		display(ans);
	}

	public static int search(int[] arr, int item) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == item) {
				return i;
			}
		}
		return -1;
	}

	public static void display(int[] y) {
		for (int i = 0; i < y.length; i++) {
			System.out.print(y[i] + "  ");
		}
	}

	public static int max(int[] arr) {
		int ans = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > ans) {
				ans = arr[i];
			}
		}
		return ans;
	}

	public static int min(int[] arr) {
		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			// if(arr[i] < ans){
			// ans = arr[i];
			// }
			ans = Math.min(ans, arr[i]);
		}
		return ans;
	}

	public static int[] reverse(int[] arr) {
		int[] ans = new int[arr.length];
		int ansidx = 0;
		int arridx = arr.length - 1;
		while (ansidx < ans.length) {
			ans[ansidx] = arr[arridx];
			ansidx++;
			arridx--;
			
		}
		return ans;

		// for(int i=0;i<ans.length;i++){
		// ans[i] = arr[arr.length-1-i];
		// }
		// return ans;

	}

}
