package session20;

public class queenperm {
	public static void main(String[] args) {
		queenperm(new boolean[4], 0, 2, "");
	}
	public static void queenperm(boolean[] board, int qpsf, int tq, String ans) {
		if (qpsf == tq) {
			System.out.println(ans);
			return;
		}
		for (int i = 0; i < board.length; i++) {
			if (board[i] == false) {
				board[i] = true; // placed queen
				queenperm(board, qpsf + 1, tq, ans + "q" + qpsf + "b" + i);
				board[i] = false; // bracktracking queen removed
			}
		}
	}

}
