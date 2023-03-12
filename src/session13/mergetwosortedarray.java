package session13;
import java.util.ArrayList;
public class mergetwosortedarray {
	public static void main(String[] args) {
		int[] arr1= {10,20,30,40,50,100};
		int[] arr2 = {5,10,15,18,20,80,90,100,110,120,130,140};
		ArrayList<Integer> ans = merge(arr1,arr2);
		System.out.println(ans);
	}

	public static ArrayList<Integer> merge(int[] arr1, int[] arr2) {
		int n = arr1.length;
		int m = arr2.length;
		ArrayList<Integer> ans = new ArrayList<Integer>();
		int i = 0;
		int j = 0;
		while (i < n && j < m) {
			if (arr1[i] == arr2[j]) {
				ans.add(arr1[i]);
				i++;
				j++;
			} else if (arr1[i] > arr2[j]) {
				ans.add(arr2[j]);
				j++;
			} else {
				ans.add(arr1[i]);
				i++;
			}
		}
		while (i < n) {
			ans.add(arr1[i]);
			i++;
		}
		while (j < m) {
			ans.add(arr2[j]);
			j++;
		}
		
		return ans;

	}

}
