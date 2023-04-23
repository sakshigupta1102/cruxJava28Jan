package session23;

public class nqueeneff {
	public static void main(String[] args) {
		boolean[][] board = new boolean[4][4];
		nqueeneff(board, 4, 0, 0, "");
	}

	public static boolean isitsafe(boolean[][] board, int cr, int cc) {
		// upward
		int row = cr - 1;
		int col = cc;
		while (row >= 0) {
			if (board[row][col]) {
				return false;
			}
			row--;
		}
		// back
		row = cr;
		col = cc - 1;
		while (col >= 0) {
			if (board[row][col]) {
				return false;
			}
			col--;
		}
		// dia left
		row = cr - 1;
		col = cc - 1;
		while (row >= 0 && col >= 0) {
			if (board[row][col]) {
				return false;
			}
			row--;
			col--;
		}

		row = cr - 1;
		col = cc + 1;
		while (row >= 0 && col < board.length) {
			if (board[row][col]) {
				return false;
			}
			row--;
			col++;
		}
		return true;

	}

	public static void nqueeneff(boolean[][] board, int tq, int qpsf, int cr,
			String ans) {
		if (tq == qpsf) {
			System.out.println(ans);
			return;
		}
		for (int col = 0; col < board.length; col++) {
			if (isitsafe(board, cr, col)) {
				board[cr][col] = true;
				nqueeneff(board, tq, qpsf + 1, cr + 1, ans + "( " + cr + "-"
						+ col + ")");
				board[cr][col] = false;
			}
		}
	}

}
