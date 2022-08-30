package leetcode_study_plans.binary_search.part1;

import java.util.Arrays;

public class Day9_Check_if_N_and_its_double_exist {

	public boolean checkIfExist(int[] arr) {
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			int ind = Arrays.binarySearch(arr, arr[i] * 2);
			if (i != ind && ind >= 0)
				return true;
		}
		return false;
	}
}
