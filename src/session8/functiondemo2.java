package session8;

public class functiondemo2 {
	public static void main(String[] args) {
		System.out.println(sum(10, 20));
		System.out.println(sum(90, 90));
		System.out.println(sum(90, 90, 90));
		System.out.println(sum(10.9f, 8f));
	}

	public static float sum(float a, float b) {
		return a + b;
	}

	public static int sum(int a, int b) {
		int sum = a + b;
		return sum;
	}

	public static int sum(int a, int b, int c) {
		int sum = a + b + c;
		return sum;
	}
}
