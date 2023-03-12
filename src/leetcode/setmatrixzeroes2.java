package leetcode;

public class setmatrixzeroes2 {
	public void setZeroes(int[][] arr) {
		boolean[] rowarr = new boolean[arr.length];
		boolean[] colarr = new boolean[arr[0].length];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				int ele = arr[i][j];
				if (ele == 0) {
					rowarr[i] = true;
					colarr[j] = true;
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (rowarr[i] || colarr[j])
					arr[i][j] = 0;
			}
		}

	}
}
