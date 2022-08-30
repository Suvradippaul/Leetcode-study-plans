package leetcode_study_plans.binary_search.part1;

public class Day7_Two_Sum_2 {

	public static void main(String[] args) {
		int[] arr = { 2, 7, 11, 15 };
		int target = 9;
		System.out.println(twoSum(arr, target));
	}

	static int[] twoSum(int[] numbers, int target) {
		int start = 0;
		int end = numbers.length - 1;

		while (numbers[start] + numbers[end] != target) {
			if (numbers[start] + numbers[end] > target) {
				end--;
			} else {
				start++;
			}
		}
		return new int[] { start + 1, end + 1 };
	}

}
