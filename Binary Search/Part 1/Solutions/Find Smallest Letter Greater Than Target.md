```
class Solution {
	public char nextGreatestLetter(char[] letters, char target) {
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
```