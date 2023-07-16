package session45;

public class set_ith_bit {
	public static void main(String[] args) {
		System.out.println(set_ith_bit(5,3));
	}

	public static int set_ith_bit(int n, int i) {
		int mask = 1 << i;
		return n | mask;
	}
}
