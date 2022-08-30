package leetcode_study_plans.binary_search.part1;

public class Day8_Search_2D__Matrix {
	
	static boolean searchMatrix(int[][] arr, int target) {
        int start = 0;
		int end = arr.length*arr[0].length - 1;
		int r = 0, c = 0;
		
		while (start <= end) {
			int mid = (start + end)/2;
			r = mid/arr[0].length;
			c = mid%arr[0].length;
			if (arr[r][c] == target) {
				return true;
			}
			else if (arr[r][c] < target) {
				start = mid + 1;
			}
			else {
				end = mid - 1;
			}
		}
		return false;
    }

}
