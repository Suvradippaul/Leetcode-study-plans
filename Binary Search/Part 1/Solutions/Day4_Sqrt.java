package leetcode_study_plans.binary_search.part1;

public class Day4_Sqrt {

	public static void main(String[] args) {
		int x = 7427367;
		System.out.println(sqrt(x));
	}
	
	static int sqrt(int x) {
        if (x == 0 || x == 1) return x;
        long s = 1;
        long e = x/2;
        
        long ans = 0;
        while (s <= e){
            long m = (s+e)/2;
            
            long sq = m*m;
            if (sq == x) {
                return (int)m;
            }
            else if (sq < x) {
                ans = m;
                s = m + 1;
            }
            else {
                e = m - 1;
            }
        }
        
        return (int)ans;
    }

}
