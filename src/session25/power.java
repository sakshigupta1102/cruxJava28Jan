package session25;

public class power {
	public static void main(String[] args) {
		System.out.println(powerlogn(2, 10));
	}
	public static int powerlogn(int a,int b){
		if(b==0){
			return 1;
		}
		int sp = powerlogn(a, b/2);
		sp = sp*sp;
		if(b%2 != 0){
			sp = sp*a;
		}
		return sp;
	}
}
