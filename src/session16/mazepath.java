package session16;

public class mazepath {
	public static void main(String[] args) {
		mazepath(0, 0, 2, 2, "");
	}

	public static void mazepath(int cr, int cc, int er, int ec, String ans) {
		//negative base case
		if (cr > er || cc > ec) {
			return;
		}
		//positive base case
		if (er == cr && cc == ec) {
			System.out.println(ans);
			return;
		}
		mazepath(cr + 1, cc, er, ec, ans + "V");
		mazepath(cr, cc + 1, er, ec, ans + "H");
		mazepath(cr + 1, cc + 1, er, ec, ans + "D");

	}
}
