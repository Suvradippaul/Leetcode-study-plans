package leetcode_study_plans.binary_search.part1;

public class Day11_Search_in_Rotated_Sorted_Array {

	public static void main(String[] args) {
		int[] arr = {4,5,6,7,0,1,2};
		int target = 0;
		int pivot = findPivot(arr);
		int index = search(arr, pivot, target);
		System.out.println(index);
	}
	
	private static int search(int[] arr, int pivot, int target) {
		int start1 = 0;
		int end1 = pivot;
		
		int start2 = pivot + 1;
		int end2 = arr.length-1;
		
		while (start1 <= end1) {
			int mid = start1 + (end1-start1)/2;
			
			if (arr[mid] == target) {
				return mid;
			}
			
			else if (arr[mid] > target) {
				end1 = mid - 1;
			}
			else {
				start1 = mid + 1;
			}
		}
		
		while (start2 <= end2) {
			int mid = start2 + (end2-start2)/2;
			
			if (arr[mid] == target) {
				return mid;
			}
			
			else if (arr[mid] > target) {
				end2 = mid - 1;
			}
			else {
				start2 = mid + 1;
			}
		}
		return -1;
	}

	private static int findPivot(int[] arr) {
		int start = 0;
		int end = arr.length-1;
		
		while (start < end) {
			int mid = start + (end-start)/2;
			
			if (arr[mid] > arr[mid+1]) {
				return mid;
			}
			
			if (mid > 0 && arr[mid] < arr[mid-1]) {
				return mid-1;
			}
			
			if (arr[mid] < arr[start]) {
				end = mid-1;
			}
			
			if (arr[mid] >= arr[start]) {
				start = mid+1;
			}
		}
		
		return 0;
	}

}
