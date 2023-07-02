package session39;
import java.util.ArrayList;
public class Heap {
	ArrayList<Integer> data = new ArrayList();

	public void add(int item) {
		data.add(item);
		upheapify(data.size() - 1);
	}

	public void upheapify(int ci) {
		int pi = (ci - 1) / 2;
		if (data.get(pi) > data.get(ci)) {
			swap(pi, ci);
			upheapify(pi);
		}
	}

	public void swap(int pi, int ci) {
		int pi_th = data.get(pi);
		int ci_th = data.get(ci);
		data.set(pi, ci_th);
		data.set(ci, pi_th);
	}

	public int remove() {
		int rv = data.get(0);
		swap(0, data.size() - 1);
		data.remove(data.size() - 1);
		downheapify(0);
		return rv;
	}

	public void downheapify(int pi) {
		int lci = (2 * pi) + 1;
		int rci = (2 * pi) + 2;
		int mini = pi;
		if (lci < data.size() && data.get(lci) < data.get(mini)) {
			mini = lci;
		}
		if (rci < data.size() && data.get(rci) < data.get(mini)) {
			mini = rci;
		}
		if (mini != pi) {
			swap(pi, mini);
			downheapify(mini);
		}

	}

	public int size() {
		return data.size();
	}
	public int get() {
		return data.get(0);
	}
	public void display() {
		System.out.println(data);
	}
}
