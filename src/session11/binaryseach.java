package session11;
public class binaryseach {
	public static void main(String[] args) {

		int[] arr = { 10, 15, 20, 25, 38, 49, 60, 72, 85 };
		System.out.println(binarysearch(arr, 50));
	}

	public static boolean binarysearch(int[] arr, int search) {
		int lo = 0;
		int hi = arr.length - 1;
		while (lo <= hi) {
			int mid = (lo + hi) / 2;
			if (arr[mid] > search) {
				hi = mid - 1;
			} else if (arr[mid] < search) {
				lo = mid + 1;
			} else {
				return true;
			}
		}
		return false;
	}
}
