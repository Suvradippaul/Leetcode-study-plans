package leetcode_study_plans.binary_search.part1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

class Pair {
	int first;
	int second;
	
	Pair(int f, int s) {
		this.first = f;
		this.second = s;
	}
}

class custom_comporator implements Comparator<Pair>{

	@Override
	public int compare(Pair p1, Pair p2) {
		if (p1.first == p2.first) return p1.second - p2.second;
		return p1.first - p2.first;
	}
	
}

public class Day9_K_Weakest_Rows_in_a_matrix {

	public static void main(String[] args) {
		int[][] mat = {{1,1,0,0,0},  {1,1,1,1,0},  {1,0,0,0,0},  {1,1,0,0,0},  {1,1,1,1,1}};
		int k = 3;
		System.out.println(Arrays.toString(kWeakestRows(mat, k)));

	}
	
	public static int[] kWeakestRows(int[][] mat, int k) {
        ArrayList<Pair> list = new ArrayList<>();
        
        for (int row = 0; row < mat.length; row++) {
            int freq = 0;
            for (int col = 0; col < mat[row].length; col++) {
                if (mat[row][col] == 1) {
                    freq++;
                }
            }
            list.add(new Pair(freq, row));
        }
        
        Collections.sort(list, new custom_comporator());
        int[] ans = new int[k];
        
        for (int i = 0; i < k; i++) {
            ans[i] = list.get(i).second;
        }
        
        return ans;
    }
}
