package session45;
public class singlenumber3 {
	public int[] singleNumber(int[] arr) {
		int x = 0;
		for (int a : arr) {
			x = x ^ a;
		}
		int idx = -1;
		while (x != 0) {
			idx++;
			if ((x & 1) == 1) {
				break;
			}
			x = x >> 1;
		}
		int mask = 1 << idx;
		System.out.print(mask);
		int first = 0;
		int sec = 0;
		for (int a : arr) {
			if ((a & mask) == 0) {
				first = first ^ a;
			} else {
				sec = sec ^ a;
			}

		}

		int[] ans = new int[2];
		ans[0] = first;
		ans[1] = sec;
		return ans;

	}
}
