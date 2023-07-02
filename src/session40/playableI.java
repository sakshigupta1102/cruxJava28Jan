package session40;

public interface playableI {
	 void play();
	 void common();
	  default void def_func(){
		 System.out.println("i am default func");
	 }
	 static void static_func(){
		 System.out.println(" i am static func");
	 }
}
