```
public class Solution extends VersionControl {
	public int firstBadVersion(int n) {
		long s = 1;
		long e = n;

		while (s < e) {
			long m = (s + e) / 2;

			if (isBadVersion((int) m)) {
				e = m;
			} else {
				s = m + 1;
			}
		}

		return (int) s;
	}
}
```