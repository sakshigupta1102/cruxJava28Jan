package leetcode;

public class houserobberrec {
	public int rob(int[] nums) {
		return houserobber(nums, 0);
	}

	public int houserobber(int[] nums, int i) {
		if (i >= nums.length) {
			return 0;
		}
		int rob = nums[i] + houserobber(nums, i + 2);
		int dontrob = houserobber(nums, i + 1);
		return Math.max(rob, dontrob);

	}

}
