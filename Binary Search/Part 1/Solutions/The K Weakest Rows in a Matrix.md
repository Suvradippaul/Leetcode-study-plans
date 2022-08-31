```
class Pair {
	int first;
	int second;

	Pair(int f, int s) {
		this.first = f;
		this.second = s;
	}
}

class custom_comporator implements Comparator<Pair> {

	@Override
	public int compare(Pair p1, Pair p2) {
		if (p1.first == p2.first)
			return p1.second - p2.second;
		return p1.first - p2.first;
	}

}

class Solution {
	public int[] kWeakestRows(int[][] mat, int k) {
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
```