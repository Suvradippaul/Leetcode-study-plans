package leetcode_study_plans.binary_search.part1;

public class Day12_Find_Minimum_in_Rotated_Sorted_Array {

	public int findMin(int[] nums) {
		int n = nums.length;
		int min = nums[n - 1];
		if (nums[0] < nums[n - 1]) {
			return nums[0];
		} else {
			for (int i = n - 1; i >= 1; i--) {
				if (nums[i - 1] < nums[i]) {
					min = nums[i - 1];
				} else {
					break;
				}
			}
		}
		return min;
	}

}
