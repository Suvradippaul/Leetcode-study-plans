package leetcode_study_plans.binary_search.part1;

public class Day3_Valid_Perfect_Square {
	public static void main(String[] args) {
		System.out.println(solve(1));
	}
	
	static boolean solve(int n) {
		int s = 1;
		int e = n/2;
		
		while (s <= e) {
			int m = (s+e)/2;
			
			if (n/m == m && n%m == 0) {
				return true;
			}
			else if (n/m > m) {
				s = m + 1;
			}
			else {
				e = m - 1;
			}
		}
		
		return false;
	}
}
