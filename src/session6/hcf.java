package session6;

public class hcf {

	public static void main(String[] args) {
		int dividend = 18;
		int divisor = 30;
		while (dividend % divisor != 0) {
			int rem = dividend % divisor;
			dividend = divisor;
			divisor = rem;
		}
		System.out.println(divisor);

	}

}
