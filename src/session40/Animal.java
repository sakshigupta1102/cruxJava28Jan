package session40;
public class Animal {
	final int maxmarks = 100;
//	public void changemarks(){
//		maxmarks = 90; // cant change final variable
//	}
	static int a = 10;
	int b;
	int c;
	public static void staticfunc() {
		System.out.println("i am static");
	}
	public void normalfunc() {
		System.out.println("i am non static");
	}
}
