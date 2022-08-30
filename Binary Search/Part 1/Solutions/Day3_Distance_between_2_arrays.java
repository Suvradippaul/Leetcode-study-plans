package leetcode_study_plans.binary_search.part1;

public class Day3_Distance_between_2_arrays {

	public static void main(String[] args) {
		int[] arr1 = {1,4,2,3};
		int[] arr2 = {-4,-3,6,10,20,30};
		int d = 3;
		System.out.println(solve(arr1, arr2, d));
	}
	
	static int solve(int[] arr1, int[] arr2, int d) {
		int count = 0;
		
		for (int i = 0; i < arr1.length; i++) {
			boolean valid = true;
			for (int j = 0; j < arr2.length; j++) {
				int diff = Math.abs(arr1[i]-arr2[j]);
				if (diff <= d) {
					valid = false;
					break;
				}
			}
			if (valid) count++;
		}
		
		return count;
	}

}
