package session40;

public class ChildClass_Interfacedemo implements runnableI, playableI {
	@Override
	public void run() {
		System.out.println("running");
	}

	@Override
	public void common() {
		System.out.println("i am common");
	}

	@Override
	public void play() {
		System.out.println("playing");
	}

	@Override
	public void def_func() {
		System.out.println("i am default func in class");
	}
 
	static void static_func() {
		System.out.println(" i am static func in class");
	}

}
