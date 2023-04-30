package session25;

public class primeno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 50;
		int i = 2;
		int flag = 0;
		while (i*i <= n) {
			if (n % i == 0) {
				flag = 1;
				break;
			}
			i++;
		}
		if (flag == 1)
			System.out.println("not prime");
		else
			System.out.println(" prime");

	}

}
