package session45;

public class Client {
public static void main(String[] args) {
	Prims p = new Prims(7);
	p.addedge(1, 2, 10);
	p.addedge(2, 3, 7);
	p.addedge(3, 4, 5);
	p.addedge(1, 4, 6);
	p.addedge(4, 5, 1);
	p.addedge(5, 6, 4);
	p.addedge(6, 7, 3);
	p.addedge(5, 7, 2);
	p.prims();
}
}
