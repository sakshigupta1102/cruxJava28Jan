package session15;

public class PI {

	public static void main(String[] args) {
		PID(5);
	}
	public static void PID(int n) {
        if(n==0) return;
        System.out.println("hello" +n);
		PID(n - 1);
		System.out.println("bye"+n);
	}

	
	
	
	
	
	public static void PI(int n) {
		if (n == 0) {
			return;
		}
		PI(n - 1);
		System.out.println(n);
	}

}
