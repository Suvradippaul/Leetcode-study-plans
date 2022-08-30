package leetcode_study_plans.binary_search.part1;

public class Day4_Smallest_letter_greater_than_target {

	public static void main(String[] args) {
		char[] letters = { 'c', 'f', 'j' };
		char target = 'a';
		System.out.println(solve(letters, target));
	}

	static char solve(char[] letters, char target) {
		if (target >= letters[letters.length - 1])
			return letters[0];

		for (char ch : letters) {
			if (ch > target) {
				return ch;
			}
		}

		return 'a';
	}

}
