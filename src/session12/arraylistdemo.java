package session12;

import java.util.ArrayList;
import java.util.Collections;

public class arraylistdemo {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		System.out.println(list.size());
		System.out.println(list);
	    System.out.println(list.get(2));
	    System.out.println(list.contains(10));
	    System.out.println(list.isEmpty());
	    list.remove(1);
	    System.out.println(list);
	    list.set(0, 100);
	    System.out.println(list);
	    list.add(0, 200);
	    System.out.println(list);
	    Collections.sort(list);
	    System.out.println(list);


	}
}
