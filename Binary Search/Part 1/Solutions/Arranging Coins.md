```
class Solution {
	public int arrangeCoins(int n) {
		long s = 1;
		long e = (n % 2 == 0) ? n / 2 : (n / 2) + 1;
		long ans = 0;
		while (s <= e) {
			long m = (s + e) / 2;

			if (op(m) > n) {
				e = m - 1;
			} else {
				if (op(m) == n)
					return (int) m;
				ans = m;
				s = m + 1;
			}
		}

		return (int) ans;
	}

	long op(long n) {
		return (n * (n + 1)) / 2;
	}
}
```