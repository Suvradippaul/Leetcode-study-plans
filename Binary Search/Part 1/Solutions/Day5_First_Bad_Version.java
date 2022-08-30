package leetcode_study_plans.binary_search.part1;

public class Day5_First_Bad_Version {
	// this function is already implemented in question.
	boolean isBadVersion(int n) {
		return true;
	}

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
