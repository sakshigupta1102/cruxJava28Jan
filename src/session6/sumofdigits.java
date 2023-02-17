package session6;

public class sumofdigits {

	public static void main(String[] args) {
		int n =1234;
		int sum=0;
		while(n!=0){
			int rem = n%10;
			sum+= rem;
			n= n/10;
		}
		System.out.println(sum);

	}

}
