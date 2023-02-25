package session8;

public class rotateanumber {
 public static void main(String[] args) {
		int num = 1234;
		int rot = -10;
		int temp = num;
		int digits = 0;
		while (temp != 0) {
			digits++;
			temp = temp / 10;
		}
		rot = rot % digits;
		if (rot < 0)
			rot = digits + rot;
		int ans = num;
		int i = 1;
		while (i <= rot) {
			int rem = num % 10;
			ans = rem * (int) Math.pow(10, digits - 1) + (num / 10);
			num = ans;
			i++;
		}
		System.out.println(ans);

	}

}
