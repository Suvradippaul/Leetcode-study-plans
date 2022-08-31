```
class Solution {
	public int maxDistance(int[] nums1, int[] nums2) {
		int ans = 0;

		for (int i = 0; i < nums1.length; i++) {
			int start = i;
			int end = search(nums2, nums1[i], start);
			if (end != -1)
				ans = Math.max(ans, (end - start));
		}

		return ans;
	}

	int search(int[] arr, int k, int index) {
		int ans = -1;
		int s = index;
		int e = arr.length - 1;

		while (s <= e) {
			int m = (s + e) / 2;

			if (arr[m] < k) {
				e = m - 1;
			} else {
				ans = m;
				s = m + 1;
			}
		}

		return ans;
	}
}
```