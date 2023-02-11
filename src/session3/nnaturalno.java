package session3;
import java.util.*;
public class nnaturalno {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int i=1;
		int sum=0;
		while(i<=n){
			System.out.print(i+" " );
			sum = sum+ i;
			i= i+1;
		}
		System.out.println();
		System.out.println("the sum is   " + sum);
		
		
	}
}
