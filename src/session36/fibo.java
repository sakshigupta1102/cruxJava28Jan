package session36;

public class fibo {
	public static void main(String[] args) {
		System.out.println(fiboTD(6, new int[7]));
		System.out.println(fiboBU(6));
	}

	public static int fiboTD(int n, int[] strg) {
		if (n == 0 || n == 1)
			return n;
		if (strg[n] != 0)
			return strg[n];
		int a = fiboTD(n - 1, strg);
		int b = fiboTD(n - 2, strg);
		return strg[n] = a + b;
	}
	public static int fiboBU(int n){
		int[] strg = new int[n+1];
		strg[0] =0;
		strg[1] =1;
		for(int i=2;i<strg.length;i++){
			strg[i] = strg[i-1] + strg[i-2];
		}
		return strg[n];	
	}
	public static int fiboBUSE(int n)
	{
		int[] strg = new int[2];
		strg[0] = 0;
		strg[1] = 1;
		for(int i=2;i<=n;i++){
			int sum = strg[0] +strg[1];
			strg[0] = strg[1];
			strg[1] = sum;
		}
		return strg[1];
	}
	
	
	
	
	
	
	
	
	
}
