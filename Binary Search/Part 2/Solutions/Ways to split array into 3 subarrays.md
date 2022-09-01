```
class Solution {
    public int waysToSplit(int[] nums) {
        return solve(nums);
    }
    
    int solve(int[] arr) {
		int mod = 1000_000_007;
        int n = arr.length;
        
        // creating prefix array
        int[] prefix = new int[n];
        prefix[0] = arr[0];
        for (int i = 1; i < prefix.length; i++) {
        	prefix[i] = prefix[i-1] + arr[i];
        }
        
        int count = 0;
        for (int i = 1; i < n-1; i++) {
        	int leftSum = prefix[i-1];
        	if (leftSum > (prefix[n-1]-leftSum)/2) break;    // take the case of [1, 1, 1]. leftSum should be smaller than or equal to remainingSum/2
        	
        	int left = bs(prefix, i, leftSum, true);        // finding what can be the first position of mid
        	int right = bs(prefix, i, leftSum, false);      // finding what can be the first position of mid
        	
        	if (left == -1 || right == -1) continue;
        	
        	count = (count + (right-left+1)%mod)%mod;
        }
        
        return count;
    }

	int bs( int[] prefix, int index, int leftSum, boolean findLeft) {
		int n = prefix.length;
		int lo = index;
		int hi = n-2;
		
		int ans = -1;
		while (lo <= hi) {
			int mid = (lo+hi) >> 1;
			
			int midSum = prefix[mid]-leftSum;
			int rightSum = prefix[n-1] - prefix[mid];
			
			if (leftSum <= midSum && midSum <= rightSum) {
				ans = mid;
				if (findLeft) hi = mid-1;
				else lo = mid+1;
			}
			else if (leftSum > midSum) lo = mid + 1;
			else if (midSum > rightSum) hi = mid - 1;
		}

		return ans;
	}
}
```