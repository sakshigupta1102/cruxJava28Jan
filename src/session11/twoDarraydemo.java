package session11;

import java.util.Scanner;

public class twoDarraydemo {
	public static void main(String[] args) {
		int[][] arr2 = { { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 } };
		display(arr2);
		System.out.println("****************");
		transposeinplace(arr2);
		display(arr2);

	}

	public static void display(int[][] arr) {
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[0].length; col++) {
				System.out.print(arr[row][col] + "  ");
			}
			System.out.println();
		}
	}

	public static void takeinput(int n, int m) {
		int[][] arr = new int[n][m];
		Scanner scan = new Scanner(System.in);
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[0].length; col++) {
				arr[row][col] = scan.nextInt();
			}
		}
	}

	public static void verticalprint(int[][] arr) {
		for (int col = 0; col < arr[0].length; col++) {
			for (int row = 0; row < arr.length; row++) {
				System.out.println(arr[row][col] + " ");
			}
		}
	}

	public static void waveprint(int[][] arr) {
		for (int row = 0; row < arr.length; row++) {
			if (row % 2 == 0) {
				for (int col = 0; col < arr[0].length; col++)
					System.out.print(arr[row][col] + "  ");
			} else {
				for (int col = arr[0].length - 1; col >= 0; col--) {
					System.out.print(arr[row][col] + "   ");
				}
			}
		}
	}

	public static int[][] transposeextraspace(int[][] arr) {
		int[][] ans = new int[arr.length][arr[0].length];
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[0].length; col++) {
				ans[row][col] = arr[col][row];
			}
		}
		return ans;

	}
	public static void transposeinplace(int[][] arr){
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr[0].length;j++){
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}
	}
	
	
	
	
	
	
	

}
