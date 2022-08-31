```
class Solution {
	public int countNegatives(int[][] grid) {
		int count = 0;
		for (int[] a : grid) {
			for (int n : a) {
				if (n < 0)
					count++;
			}
		}
		return count;
	}
}
```