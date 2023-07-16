package session45;
public class powerof2 {
	public static void main(String[] args) {
		System.out.println(ispowerof2(8)) ;
		System.out.println(ispowerof2(16));
		System.out.println(ispowerof2(3));
	}
	public static  boolean ispowerof2(int n){
		return countbits(n)==1;
	}
	public static int countbits(int n) {
		int cnt =0;
		while(n!=0){
			int bit = n & 1;
			if(bit == 1) cnt++;
			n= n>>1;
		}
		return cnt;
	}
}


