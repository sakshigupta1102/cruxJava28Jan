package leetcode;

import java.util.ArrayList;

public class subset1 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3 };
		ArrayList<ArrayList<Integer>> big = new ArrayList();
		subset1(arr, new ArrayList<Integer>(), 0, big);
		System.out.println(big);
	}

	public static void subset1(int[] arr, ArrayList<Integer> list, int vidx) {
		if (vidx == arr.length) {
			System.out.println(list);
			return;
		}
		list.add(arr[vidx]);
		subset1(arr, list, vidx + 1); // include
		list.remove(list.size() - 1);
		subset1(arr, list, vidx + 1); // exclude
	}

	public static void subset1(int[] arr, ArrayList<Integer> small, int vidx,
			ArrayList<ArrayList<Integer>> big) {
		if (vidx == arr.length) {
			ArrayList<Integer> copy = new ArrayList<Integer>(small);
			big.add(copy);
			return;
		}
		small.add(arr[vidx]);
		subset1(arr, small, vidx + 1,big); // include
		small.remove(small.size() - 1);
		subset1(arr, small, vidx + 1,big); // exclude
	}
}
