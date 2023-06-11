package session37;

public class coinchange2 {
	public static void main(String[] args) {
		int[] coin = {1,2,5};
		System.out.println(CoinChangesBU(coin, 5));
	}
	public static int coinchange2(int[] coin, int amt, int i) {
		if (amt == 0)
			return 1;
		if (i >= coin.length)
			return 0;
		int inc = 0;
		int exc = 0;
		if (amt >= coin[i]) {
			inc = coinchange2(coin, amt - coin[i], i);
		}
		exc = coinchange2(coin, amt, i + 1);
		return inc + exc;

	}
	public static int CoinChangesBU(int[] arr, int amount) {
		int[][] strg = new int[amount+1][arr.length+1];
		for(int col= 0;col<strg[0].length;col++){
			strg[0][col] = 1;
		}
		for(int amt =1 ;amt<strg.length;amt++){
			for(int idx = 1 ; idx< strg[0].length;idx++){
				int inc=0;
				if(amt >= arr[idx-1]){
					 inc = strg[amt-arr[idx-1]][idx];
				}
				int dnt_inc = strg[amt][idx-1];
				strg[amt][idx] = inc+dnt_inc;
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
