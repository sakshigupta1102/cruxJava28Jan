package session4;

public class ques4 {
	public static void main(String[] args) {
		int n = 7;
		int row = 1;
		int nst = 1;
		int nsp = n - 1;
		while (row <= n) {
			int csp = 1;
			int cst = 1;
			while (csp <= nsp) {
				System.out.print("  ");
				csp++;
			}
			while (cst <= nst) {
				System.out.print("* ");
				cst++;
			}
			System.out.println();
			row = row + 1;
			nsp -= 1;
			nst += 1;

		}

	}
}
