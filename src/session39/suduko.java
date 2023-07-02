package session39;
import java.util.Scanner;
public class suduko {
	public static void main(String[] args) {
		String str = "00006010000700430520500080910"
				+ "90700030004000870000260040203000" + "90830000750001708030";
		int[][] board = new int[9][9];
		int idx = 0;
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				board[i][j] = str.charAt(idx) - '0';
				idx++;
			}
		}
		suduko(board, 0, 0);

	}

	public static void display(int[][] arr) {

		for (int[] is : arr) {
			for (int i : is) {
				System.out.print(i + " ");
			}

			System.out.println();
		}
	}
	public static void suduko(int[][] board, int cr, int cc) {
		if (cc == board[0].length) {
			cr = cr + 1;
			cc = 0;
		}
		if (cr == board.length) {
			display(board);
			return;
		}
		if (board[cr][cc] != 0) {
			suduko(board, cr, cc + 1);
			return;
		}
		for (int d = 1; d <= 9; d++) {
			if (itisSafe(board, cr, cc, d)) {
				board[cr][cc] = d;
				suduko(board, cr, cc + 1);
				board[cr][cc] = 0;
			}
		}

	}

	private static boolean itisSafe(int[][] board, int cr, int cc, int d) {
		// row
		for (int col = 0; col < 9; col++) {
			if (board[cr][col] == d) {
				return false;
			}
		}
		// col
		for (int row = 0; row < 9; row++) {
			if (board[row][cc] == d) {
				return false;
			}
		}

		int sr = cr - (cr % 3);
		int sc = cc - (cc % 3);
		for (int i = sr; i < sr + 3; i++) {
			for (int j = sc; j < sc + 3; j++) {
				if (board[i][j] == d) {
					return false;
				}
			}
		}
		return true;

	}

}
