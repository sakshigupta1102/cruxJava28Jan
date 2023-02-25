package session8;

public class functiondemo {
	public static void main(String[] args) {
		System.out.println("hello");
		sum();
		System.out.println("bye");
	}
	
	public static void sum(){
		int a =10;
		int b=20;
		sub();
		System.out.println(a+b);
	}
	public static void sub(){
		int a=100;
		int b=200;
		System.out.println(a-b);
	}
}
