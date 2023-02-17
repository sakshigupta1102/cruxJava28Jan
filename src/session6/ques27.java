package session6;
public class ques27 {
	public static void main(String[] args) {
		int n=5;
		int nst=1;
		int row=1;
		int nsp=n-1;
		while(row<=n){
			int csp=1;
			int cst=1;
			int num=row;
			while(csp<=nsp){
				System.out.print("  ");
				csp++;
			}
			while(cst<=nst){
				if(cst==1 || cst == nst){
					System.out.print(row+" ");
				}else{
				System.out.print(0+" ");	
				}
				cst++;
				
			}
			System.out.println();
			row+=1;
			nsp-=1;
			nst+=2;		
		}

	}
}
