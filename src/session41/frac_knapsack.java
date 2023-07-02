package session41;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class frac_knapsack {
	public static void main(String[] args) {
		int cap = 50;
		ArrayList<Item> list = new ArrayList();
		list.add(new Item(60, 10));
		list.add(new Item(100, 20));
		list.add(new Item(120, 30));
		list.add(new Item(2, 1));
		Collections.sort(list, new ItemComp());
		int currwt = 0;
		int maxprofit = 0;
		for (int i = 0; i < list.size(); i++) {
			if (currwt + list.get(i).wt <= cap) {
				maxprofit += list.get(i).profit;
				currwt += list.get(i).wt;
			} else {
				int rem = cap - currwt;
				int thisprofit = (list.get(i).profit / list.get(i).wt) * rem;
				maxprofit += thisprofit;
				break;
			}
		}
		System.out.println(maxprofit);

	}

}

class Item {
	int profit;
	int wt;

	public Item(int profit, int wt) {
		this.profit = profit;
		this.wt = wt;
	}
}

class ItemComp implements Comparator<Item> {
	@Override
	public int compare(Item o1, Item o2) {
		int ratio1 = o1.profit / o1.wt;
		int ratio2 = o2.profit / o2.wt;
		if (ratio1 > ratio2)
			return -1;
		return 1;
	}
}
