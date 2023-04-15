package session21;

public class ratchasesitscheese {
	public static void main(String[] args) {
		int[][] board ={ {0,1,0,0 } , {0,0,0,0} , {0,1,0,0} , {0,1,1,0} };
		boolean[][] visited = new boolean[board.length][board[0].length];
		ratcheese(board, 0, 0, "",visited);

	}
	public static void ratcheese(int[][] board, int cr, int cc,String ans,boolean[][] visited){
		if(cr==board.length-1 && cc == board[0].length-1){
			System.out.println(ans);
			return;
		}
		if(cr<0 || cc <0|| cc >= board[0].length || 
				cr >= board.length|| board[cr][cc] ==1||visited[cr][cc]== true){
			return;
		}
		visited[cr][cc] = true; 
		ratcheese(board, cr+1, cc, ans+"D",visited);
		ratcheese(board, cr, cc+1, ans+"R",visited);
		ratcheese(board, cr-1, cc, ans+"U",visited);
		ratcheese(board, cr, cc-1, ans+"L",visited);
		visited[cr][cc] = false; 
	}
}
