package leetcode_study_plans.binary_search.part1;

public class Day1_Guess_Number_higher_or_lower {

	// this implementation of this function is provided by Leetcode.
	int guess(int n) {
		return 0;
	}

	int guessNumber(int n) {
		int l = 0;
		int h = n;

		while (l <= h) {
			int m = l + (h - l) / 2;

			if (guess(m) == 0) {
				return m;
			}
			else if (guess(m) == 1) {
				l = m + 1;
			} else {
				h = m - 1;
			}
		}
		return -1;
	}
}
