package session41;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class jobscheduling {
	public static void main(String[] args) {
		ArrayList<job> list = new ArrayList();
		list.add(new job(1, 4, 20));
		list.add(new job(2, 2, 10));
		list.add(new job(3, 2, 40));
		list.add(new job(4, 2, 30));
		Collections.sort(list, new jobcomp());
		int[] clock = new int[list.size() + 1];
		for (int i = 0; i < list.size(); i++) {
			for (int j = list.get(i).deadline; j > 0; j--) {
				if (clock[j] == 0) {
					clock[j] = list.get(i).profit;
					break;
				}
			}
		}
		int maxprofit = 0;
		int num = 0;
		for (int i = 0; i < clock.length; i++) {
			if (clock[i] != 0) {
				maxprofit += clock[i];
				num++;
			}
		}
		System.out.println(maxprofit + "  " + num);
	}

}

class job {
	int jobid;
	int deadline;
	int profit;

	public job(int jobid, int deadline, int profit) {
		this.jobid = jobid;
		this.deadline = deadline;
		this.profit = profit;
	}

}

class jobcomp implements Comparator<job> {

	@Override
	public int compare(job o1, job o2) {
		if (o1.profit > o2.profit)
			return -1;
		else if (o1.profit < o2.profit)
			return 1;
		else if (o1.deadline > o2.deadline)
			return 1;
		return -1;
	}
}
