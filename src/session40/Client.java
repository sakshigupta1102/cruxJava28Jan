package session40;

public class Client {
	int num = 10;

	public static void main(String[] args) {
		// System.out.println(num);
//		System.out.println(Animal.a);
//		Animal obj = new Animal();
//		System.out.println(obj.a);
//		System.out.println(obj.b);
//		System.out.println(obj.c);
//		Animal obj1 = new Animal();
//		System.out.println(obj1.a);
//		obj1.a = 99;
//		System.out.println(obj.a);
//		obj1.b = 1000000;
//		obj.b = 999999;
//		System.out.println(obj1.b + "  " + obj.b);
//		Animal.staticfunc();
//		obj.normalfunc();
//		obj1.normalfunc();
//		obj.staticfunc();
//		// clientfunc();
//		System.out.println(obj.maxmarks);
//		// Abs_class absobj = new Abs_class();
//		Childclass childobj = new Childclass();
//		childobj.run();
		
		playableI obj = new ChildClass_Interfacedemo();
		obj.def_func();
	    playableI.static_func();
	    ChildClass_Interfacedemo obj2 = new ChildClass_Interfacedemo();
	    obj2.static_func();
	    
	}

	public void clientfunc() {
		Animal.staticfunc();
		Animal obj = new Animal();
		obj.normalfunc();
		obj.staticfunc();
	}
}
