package session14;
public class string_vs_sb {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		appendString();
		long end = System.currentTimeMillis();
		System.out.println(end - start);
	}
	public static void appendString() {
		int n = 100000;
		StringBuilder str= new StringBuilder();
		for (int i = 1; i <= n; i++) {
			str.append(i);
		}
	}
}
