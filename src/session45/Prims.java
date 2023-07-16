package session45;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;
import session45.Prims.Edgepair;
public class Prims {
	HashMap<Integer, HashMap<Integer, Integer>> map = new HashMap();

	public Prims(int v) {
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap());
		}
	}

	public void addedge(int u, int v, int cost) {
		map.get(u).put(v, cost);
		map.get(v).put(u, cost);
	}

	class Edgepair {
		int u;
		int v;
		int cost;

		public Edgepair(int u, int v, int cost) {
			this.u = u;
			this.v = v;
			this.cost = cost;
		}

		@Override
		public String toString() {
			return this.u + "--" + this.v + " " + this.cost;
		}
	}

	public void prims() {
		PriorityQueue<Edgepair> pq = new PriorityQueue(new paircomp());
		HashSet<Integer> visited = new HashSet();
		pq.add(new Edgepair(1, 1, 0));
		while (!pq.isEmpty()) {
			Edgepair rp = pq.poll();
			if (visited.contains(rp.u)) {
				continue;
			}
			visited.add(rp.u);
			System.out.println(rp);
			for (int nbrs : map.get(rp.u).keySet()) {
				if (!visited.contains(nbrs)) {
					pq.add(new Edgepair(nbrs, rp.u, map.get(rp.u).get(nbrs)));
				}
			}

		}
	}

}

class paircomp implements Comparator<Edgepair> {
	@Override
	public int compare(Edgepair o1, Edgepair o2) {
		if (o1.cost < o2.cost)
			return -1;
		return 1;
	}

}
