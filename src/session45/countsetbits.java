package session45;
public class countsetbits {
	public static void main(String[] args) {
		System.out.println(countbits(5));
		System.out.println(countbits(8));
		System.out.println(countbits(13));
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
