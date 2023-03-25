package session15;

public class PD {
	public static void main(String[] args) {
		PD(5);
		System.out.println("bye bye ");

	}
	public static void PD(int n) {
		//base case
		if(n==0){
			return;
		}
		System.out.println(n); // self work
		PD(n-1); // recursion call
	}
}
