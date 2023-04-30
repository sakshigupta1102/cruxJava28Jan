package session25;

import java.util.Arrays;

public class sieve {

	public static void main(String[] args) {
		int n = 50;
		boolean[] sieve = new boolean[n + 1];
		Arrays.fill(sieve, true);
		sieve[0] = false;
		sieve[1] = false;
		for (int table = 2; table * table <= n; table++) {
			if(sieve[table] == false) continue;
			for (int mult = 2; mult * table <= n; mult++) {
				sieve[mult * table] = false;
			}
		}
		for (int i = 0; i < sieve.length; i++) {
			if (sieve[i])
				System.out.print(i+" ");
		}

	}

}
