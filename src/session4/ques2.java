package session4;

public class ques2 {

	public static void main(String[] args) {
		int n=7;
		int row=1;
		int nst=1;
		while(row<=n){
			int cst=1;
			while(cst<=nst){
				System.out.print("*  ");
				cst=  cst+1;
			}
			System.out.println();
			row=row+1;
			nst=nst+1;
		}

	}

}
