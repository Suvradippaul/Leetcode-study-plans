package leetcode_study_plans.binary_search.part1;

public class Day8_Count_Negative_Numbers {

	public int countNegatives(int[][] grid) {

		int count = 0;

		for (int[] row : grid) {
			count += binary_search(row);
		}
		return count;
	}

	int binary_search(int[] arr) {
		int start = 0;
		int end = arr.length;

		while (start < end) {
			int mid = start + (end - start) / 2;

			if (arr[mid] < 0) {
				end = mid;
			} else {
				start = mid + 1;
			}
		}
		return arr.length - end;
	}

}
