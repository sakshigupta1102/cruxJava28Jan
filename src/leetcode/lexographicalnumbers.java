package leetcode;

import java.util.ArrayList;
import java.util.List;

public class lexographicalnumbers {
	public List<Integer> lexicalOrder(int n) {
		List<Integer> list = new ArrayList();
		for (int i = 1; i <= 9; i++) {
			lexo(i, n, list);
		}
		return list;
	}

	public static void lexo(int curr, int end, List<Integer> list) {
		if (curr > end) {
			return;
		}
		list.add(curr);
		int i = 0;
		if (curr == 0)
			i = 1;
		for (; i <= 9; i++) {
			lexo(curr * 10 + i, end, list);
		}

	}
}
