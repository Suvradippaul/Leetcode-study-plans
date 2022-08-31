```
class Pair {
    int start;
    int index;
    Pair(int s, int i) {
        this.start = s;
        this.index = i;
    }
}

class Custom_comporator implements Comparator<Pair>{

	@Override
	public int compare(Pair p1, Pair p2) {
		if (p1.start == p2.start) return p1.index - p2.index;
		return p1.start - p2.start;
	}
	
}

class Solution {
    public int[] findRightInterval(int[][] intervals) {
        List<Pair> list = new ArrayList<>();
        
        for (int i = 0; i < intervals.length; i++) {
            list.add(new Pair(intervals[i][0], i));
        }
        
        Collections.sort(list, new Custom_comporator());
        
        int[] ans = new int[intervals.length];
        for (int i = 0; i < intervals.length; i++) {
            ans[i] = bs(list, intervals[i][1]);
        }
        
        return ans;
    }
    
    int bs(List<Pair> list, int max) {
        int lo = 0;
        int hi = list.size()-1;
        
        if (max > list.get(hi).start) return -1;
        
        while (lo < hi) {
            int mid = ((lo+hi)%2==1) ? ((lo+hi)>>1)+1 : (lo+hi)>>1;
            
            if (max < list.get(mid).start) {
            	hi = mid - 1;
            }
            else {
                lo = mid;
            }
        }
        
        if (list.get(lo).start != max) return list.get(lo+1).index;
        return list.get(lo).index;
    }
}
```