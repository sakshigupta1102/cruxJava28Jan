package session20;

public class queencomb {

	public static void main(String[] args) {
		queencomb(new boolean[4], 0, 2, "", 0);
	}

	public static void queencomb(boolean[] board, int qpsf, int tq, String ans,
			int lastplaced) {
		if (qpsf == tq) {
			System.out.println(ans);
			return;
		}
		for (int i = lastplaced; i < board.length; i++) {
			if (board[i] == false) {
				board[i] = true; // placed queen
				queencomb(board, qpsf + 1, tq, ans + "q" + qpsf + "b" + i, i);
				board[i] = false; // bracktracking queen removed
			}
		}
	}

}
