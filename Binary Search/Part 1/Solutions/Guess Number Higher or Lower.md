
```
public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int l = 0;
        int h = n;
        
        while (l <= h) {
            int m = l + (h-l)/2;
            
            if (guess(m) == 0) {
                return m;
            }
            else if (guess(m) == 1) {
                l = m + 1;
            }
            else {
                h = m - 1;
            }
        }
        return -1;
    }
}

```