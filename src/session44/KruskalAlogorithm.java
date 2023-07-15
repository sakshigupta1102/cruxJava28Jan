package session44;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
public class KruskalAlogorithm {
	HashMap<Integer, HashMap<Integer, Integer>> map;

	public KruskalAlogorithm(int v) {
		map = new HashMap();
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap());
		}
	}

	public void addEdge(int u, int v, int cost) {
		map.get(u).put(v, cost);
		map.get(v).put(u, cost);
	}

	class EdgePair {
		int u;
		int v;
		int cost;

		public EdgePair(int u, int v, int cost) {
			this.u = u;
			this.v = v;
			this.cost = cost;
		}

		@Override
		public String toString() {
			return this.u + "--" + this.v + "  " + this.cost;
		}
	}

	public ArrayList<EdgePair> getAllEdges() {
		ArrayList<EdgePair> list = new ArrayList();
		for (int u : map.keySet()) {
			for (int v : map.get(u).keySet()) {
				list.add(new EdgePair(u, v, map.get(u).get(v)));
			}
		}
		return list;
	}
	public int kruskal() {
		int ans = 0;
		DisjointSet dsu = new DisjointSet();
		for (int u : map.keySet()) {
			dsu.createSet(u);
		}
		ArrayList<EdgePair> alledges = getAllEdges();
		Collections.sort(alledges, new pairComparator());
		for (EdgePair pair : alledges) {
			int u = pair.u;
			int v = pair.v;
			int up = dsu.find(u);
			int vp = dsu.find(v);
			if (up != vp) {
				System.out.println(pair);
				dsu.Union(up, vp);
				ans += pair.cost;
			}

		}
		return ans;

	}

	class pairComparator implements Comparator<EdgePair> {
		@Override
		public int compare(EdgePair o1, EdgePair o2) {
			if (o1.cost < o2.cost)
				return -1;
			else
				return 1;
		}

	}

}
