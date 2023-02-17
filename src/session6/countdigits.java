package session6;

import java.util.Scanner;

public class countdigits {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int ans=0;
		int d= scan.nextInt();
		while(num !=0){
			int rem = num%10;
			if(rem == d) ans++;
			num=num/10;
		}
		System.out.println(ans);
		

	}
}
