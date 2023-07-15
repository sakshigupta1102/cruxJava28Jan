package session44;
import java.util.HashMap;
public class DisjointSet {
	public class Node {
		int val;
		int rank;
		Node parent;
	}
	HashMap<Integer, Node> map = new HashMap();
	public void createSet(int val){
		Node nn = new Node();
		nn.val= val;
		nn.rank = 0;
		nn.parent = nn;
		map.put(val, nn);
	}
	public int find(int v){
	Node nn = map.get(v);
	return find(nn).val;
	}
	public Node find(Node nn){
		if(nn == nn.parent){
			return nn;
		}
		Node myparent = nn.parent;
		return find(myparent);
	}
	public void Union(int v1, int v2){
		Node n1 = map.get(v1);
		Node n2 = map.get(v2);
		Node pn1= find(n1);
		Node pn2 = find(n2);
		if(pn1.rank == pn2.rank){
			pn1.parent = pn2;
			pn2.rank = pn2.rank+1;
			
		}else if(pn1.rank > pn2.rank){
			pn2.parent = pn1;
		}else{
			pn1.parent = pn2;
		}
	}
}
