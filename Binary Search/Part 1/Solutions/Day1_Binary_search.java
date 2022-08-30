package leetcode_study_plans.binary_search.part1;

public class Day1_Binary_search {

	static int search(int[] arr, int target) {
		int l = 0;
		int h = arr.length - 1;

		while (l <= h) {
			int m = (l + h) / 2;

			if (arr[m] == target)
				return m;
			else if (target > arr[m]) {
				l = m + 1;
			} else {
				h = m - 1;
			}
		}
		return -1;
	}
}
