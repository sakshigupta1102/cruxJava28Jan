package session13;
import java.util.ArrayList;
public class addtwonumbers {
	public static void main(String[] args) {
		int[] num1 = { 9,9,9};
		int[] num2 = {2,2};
		System.out.println(add(num1, num2));
	}
	public static ArrayList<Integer> add(int[] num1, int[] num2) {
		int i = num1.length - 1;
		int j = num2.length - 1;
		int carry = 0;
		int sum = 0;
		ArrayList<Integer> ans = new ArrayList();
		while (i >= 0 || j >= 0) {
			sum = carry;
			if (i >= 0) {
				sum += num1[i];
				i--;
			}
			if (j >= 0) {
				sum += num2[j];
				j--;
			}
			int rem = sum % 10;
			carry = sum / 10;
			ans.add(0,rem);
		}
		if(carry != 0){
			ans.add(0,carry);
		}
		return ans;

	}
}
