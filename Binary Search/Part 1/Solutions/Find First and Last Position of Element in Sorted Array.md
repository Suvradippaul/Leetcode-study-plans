```
class Solution {
	public int[] searchRange(int[] nums, int target) {
		int[] ans = { -1, -1 };
		if (nums.length == 0 || target < nums[0] || target > nums[nums.length - 1]) {
			return ans;
		}

		ans[0] = findFirst(nums, target);
		ans[1] = findLast(nums, target);

		return ans;
	}

	int findFirst(int[] nums, int target) {
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

	int findLast(int[] nums, int target) {
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
```