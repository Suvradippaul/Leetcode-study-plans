package leetcode_study_plans.binary_search.part1;

public class Day5_First_and_Last_position_of_element {

	public static void main(String[] args) {
		int[] nums = { 1, 2 };
		int target = 2;

		int[] ans = { -1, -1 };

		ans[0] = findFirst(nums, target);
		ans[1] = findLast(nums, target);

//		return ans;
	}

	static int findFirst(int[] nums, int target) {
		int idx = -1;
		int start = 0;
		int end = nums.length - 1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (nums[mid] >= target) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
			if (nums[mid] == target)
				idx = mid;
		}
		return idx;
	}

	static int findLast(int[] nums, int target) {
		int idx = -1;
		int start = 0;
		int end = nums.length - 1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (nums[mid] <= target) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
			if (nums[mid] == target)
				idx = mid;
		}
		return idx;
	}
}
