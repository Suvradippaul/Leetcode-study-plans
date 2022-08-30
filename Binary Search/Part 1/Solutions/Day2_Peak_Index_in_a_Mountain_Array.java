package leetcode_study_plans.binary_search.part1;

public class Day2_Peak_Index_in_a_Mountain_Array {

	public int peakIndexInMountainArray(int[] arr) {
		int s = 0;
		int e = arr.length - 1;

		while (s <= e) {
			int m = (s + e) / 2;
			
			// That means we are in the ascending part of the array
			if (arr[m] < arr[m + 1]) {
				s = m + 1;
			} 
			
			// That means we are in the descending part of the array
			else {
				e = m - 1;
			}
		}

		return s;
	}
}
