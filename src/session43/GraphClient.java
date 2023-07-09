package session43;
import java.util.HashSet;
public class GraphClient {
	public static void main(String[] args) {
		graph g = new graph(7);
		g.addEdge(1, 2, 5);
		g.addEdge(2, 3, 4);
		g.addEdge(3, 4, 3);
		g.addEdge(4, 1, 7);
		g.addEdge(4, 5, 2);
		g.addEdge(5, 6, 8);
		g.addEdge(6, 7, 9);
		g.addEdge(7, 5, 11);
		g.display();
		//g.removeEdge(4, 5);
		g.printpath(1, 7, new HashSet(), "");
		System.out.println(g.BFS(1, 7));
		System.out.println(g.DFS(1, 7));
		g.DFT();
		
	}
}
