package session7; 
public class pascaltriangle {
	public static void main(String[] args) {
		int n=4;
		int row =0;
		int nst=0;
		while(row<=n){
			int val=1;
			int cst=0;
			while(cst<=nst){
				System.out.print(val+" ");
				val = ((val)*(row-cst))/(cst+1);
				cst++;
			}
			System.out.println();
			row++;
			nst++;
		}

	}

}
