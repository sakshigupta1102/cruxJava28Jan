package session22;

public class nqueen {
	public static void main(String[] args) {
		boolean[][] board = new boolean[4][4];
		nquuen(board, 0, 0, 0, 4, "");
	}

	public static void nquuen(boolean[][] board, int cr, int cc, int qpsf,
			int tq, String ans) {
		if(tq==qpsf){
			System.out.println(ans);
			return;
		}
		if(cc==board.length){
			cr=cr+1;
			cc=0;
		}
		if(cr==board.length){
			return;
		}
		if(isitsafe(board, cr, cc)){
			board[cr][cc] = true;
			nquuen(board, cr, cc+1, qpsf+1, tq, ans+ "( " + cr +"-"+ cc+")");	
		    board[cr][cc] = false;
		}
		nquuen(board, cr, cc+1, qpsf, tq, ans);
		

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
		
		row=cr-1;
		col=cc+1;
		while (row >= 0 && col < board.length) {
			if (board[row][col]) {
				return false;
			}
			row--;
			col++;
		}
		return true;
		

	}
}