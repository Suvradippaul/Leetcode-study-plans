```
class Solution {
    public int singleNonDuplicate(int[] nums) {
        return solve(nums);
    }
    
    int solve(int[] arr) {
		int n = arr.length;
        
        // for single element and last element, check seperately
		if (n == 1 || arr[n-1] != arr[n-2]) return arr[n-1];
		
		int lo = 0;
		int hi = n-2;     
		
		while (lo < hi) {
			int mid = ((lo+hi) >> 1);
			
			// if mid is odd, mid^1 = mid-1. if mid is even, mid^1 = mid+1
			if (arr[mid] == arr[mid^1]) {         
				lo = mid + 1;              // we are in Part A, so go right      
			}
			else {
				hi = mid;                  // we are in Part B, so look left
			}
		}
        
		return arr[lo];
	}
}
```