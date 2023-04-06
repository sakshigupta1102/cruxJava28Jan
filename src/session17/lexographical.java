package session17;

import java.util.ArrayList;

public class lexographical {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		lexo(0, 100, list);
		System.out.println(list);
	}

	public static void lexo(int curr, int end, ArrayList<Integer> list) {
		if (curr > end) {
			return;
		}
		list.add(curr);
		int i=0;
		if(curr==0) i =1;
		for (; i <= 9; i++) {
			lexo(curr * 10 + i, end, list);
		}

	}
}
