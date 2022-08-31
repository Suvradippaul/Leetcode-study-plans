```
class Solution {
	public int[] intersect(int[] arr1, int[] arr2) {
		Arrays.sort(arr1);
		Arrays.sort(arr2);

		int i = 0;
		int j = 0;

		ArrayList<Integer> list = new ArrayList<Integer>();
		while (i < arr1.length && j < arr2.length) {
			while (i < arr1.length && j < arr2.length && arr1[i] < arr2[j]) {
				i++;
			}

			while (i < arr1.length && j < arr2.length && arr2[j] < arr1[i]) {
				j++;
			}

			if (i < arr1.length && j < arr2.length && arr1[i] == arr2[j]) {
				list.add(arr1[i]);
				i++;
				j++;
			}
		}

		int[] ans = new int[list.size()];
		for (int in = 0; in < ans.length; in++) {
			ans[in] = list.get(in);
		}

		return ans;
	}
}
```