package session44;

public class Client {
public static void main(String[] args) {
	KruskalAlogorithm kruskal = new KruskalAlogorithm(7);
	kruskal.addEdge(1, 2, 1);
	kruskal.addEdge(1, 4, 2);
	kruskal.addEdge(5, 7, 3);
	kruskal.addEdge(6, 7, 4);
	kruskal.addEdge(2, 3, 5);
	kruskal.addEdge(5, 6, 6);
	kruskal.addEdge(4, 3, 7);
	kruskal.addEdge(4, 5, 8);
	kruskal.addEdge(1, 3, 9);
	int ans = kruskal.kruskal();
	System.out.println(ans);
	
	
}
}
