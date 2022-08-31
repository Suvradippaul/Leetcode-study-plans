```
class Solution {
	public boolean isPerfectSquare(int num) {
		if (num == 1)
			return true;
		return solve(num);
	}

	boolean solve(int n) {
		int s = 1;
		int e = n / 2;

		while (s <= e) {
			int m = (s + e) / 2;

			if (n / m == m && n % m == 0) {
				return true;
			} else if (n / m > m) {
				s = m + 1;
			} else {
				e = m - 1;
			}
		}
		
		return false;
	}
}
```