```
class Solution {
	public int specialArray(int[] nums) {
		for (int i = 0; i <= nums.length; i++) {
			int count = 0;
			for (int n : nums) {
				if (n >= i)
					count++;
			}
			if (count == i)
				return i;
		}
		return -1;
	}
}
```