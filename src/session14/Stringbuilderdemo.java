package session14;
public class Stringbuilderdemo {
	public static void main(String[] args) {
//		StringBuilder sb = new StringBuilder();
//		sb.append("a");
//		sb.append("xyz");
//		System.out.println(sb);
//		System.out.println(sb.charAt(2));
//		System.out.println(sb.insert(0, 'n'));
		String str = "abc";
		StringBuilder sb1 = new StringBuilder(str);
		System.out.println(sb1);
		System.out.println(sb1.toString());
		sb1.setCharAt(0, 'b');
		System.out.println(sb1);
		char ch = 'a';
		ch = Character.toUpperCase(ch);
		System.out.println(ch);
//		public static void appendString() {
//
//			int n = 100000;
//			 String str = "";
//
//			for (int i = 1; i <= n; i++) {
//				str += i ;
//			}
	//	long start = System.currentTimeMillis();
//		appendString();
//		long end = System.currentTimeMillis();
		
	}
}
