```
class Solution {
	public boolean checkIfExist(int[] arr) {
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			int ind = Arrays.binarySearch(arr, arr[i] * 2);
			if (i != ind && ind >= 0)
				return true;
		}
		return false;
	}
}
```