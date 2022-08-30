package leetcode_study_plans.binary_search.part1;

public class Day10_Sum_of_Square_numbers {
	
	boolean judgeSquareSum(int c) {
        long start = 0;
        long end = (long)Math.sqrt(c);
        
        while (start <= end) {
            long curr = start * start + end * end;
            if (curr == c) {
                return true;
            }
            else if (curr > c){
                end--;
            }
            else {
                start ++;
            }
        }
        return false;
    }

}
