package leetcode_study_plans.binary_search.part1;

public class Day6_Kth_Missing_Positive_Number {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 5, 9, 19 };
		System.out.println(findKthPositive(arr, 10));
	}

	static int findKthPositive(int[] arr, int k) {
		for (int i : arr) {
			if (i <= k)
				k++;
			else
				break;
		}
		return k;
	}
}
