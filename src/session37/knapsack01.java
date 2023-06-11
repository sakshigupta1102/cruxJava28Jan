package session37;

public class knapsack01 {
	public static void main(String[] args) {
		int[] price = { 15, 14, 10, 45, 30 };
		int[] wt = { 2, 5, 1, 3, 4 };
		//int[][] strg = new int[price.length + 1][7 + 1];
		//System.out.println(maxprofit(price, wt, 7, 0, strg));
		System.out.println(maxprofitBU(price, wt, 7));
	}

	public static int maxprofit(int[] price, int[] wt, int cap, int i,
			int[][] strg) {
		if (i == wt.length || cap == 0) {
			return 0;
		}
		if (strg[i][cap] != 0) {
			return strg[i][cap];
		}
		int inc = 0;
		if (cap >= wt[i])
			inc = price[i] + maxprofit(price, wt, cap - wt[i], i + 1, strg);
		int exc = maxprofit(price, wt, cap, i + 1, strg);
		return strg[i][cap] = Math.max(inc, exc);
	}

	public static int maxprofitBU(int[] price, int[] wt, int cap) {
		int[][] strg = new int[price.length + 1][cap + 1];
		for (int i = 1; i < strg.length; i++) {
			for (int c = 1; c < strg[0].length; c++) {
				int inc = 0;
				if (c >= wt[i - 1]) {
					inc = price[i - 1] + strg[i - 1][c - wt[i - 1]];
				}
				int exc = strg[i - 1][c];
				strg[i][c] = Math.max(inc, exc);
			}
		}
		for(int i=0;i<strg.length;i++){
			for(int j=0;j<strg[0].length;j++){
				System.out.print(strg[i][j]+"  ");
			}
			System.out.println();
		}
		return strg[strg.length-1][strg[0].length-1];
	}

}
