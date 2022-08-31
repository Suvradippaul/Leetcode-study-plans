```
class Pair {
    int d;
    int p;
    Pair(int diff, int pro) {
        this.d = diff;
        this.p = pro;
    }
}

class Custom_comporator implements Comparator<Pair>{
	@Override
	public int compare(Pair p1, Pair p2) {
		if (p1.d == p2.d) return p2.p - p1.p;
		return p1.d - p2.d;
	}
}

class Solution {
    public int maxProfitAssignment(int[] diff, int[] pro, int[] worker) {
        int n = diff.length;
        
        List<Pair> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new Pair(diff[i], pro[i]));
        }
        
        Collections.sort(list, new Custom_comporator());
        
        int maxP = 0;
        for (Pair p : list) {
        	maxP = Math.max(maxP, p.p);
        	p.p = Math.max(maxP, p.p);
        }
        
        int ans = 0;
        for (int i = 0; i < worker.length; i++) {
            if (list.get(0).d > worker[i]) {
                continue;
            }
            
            int index = bs(list, worker[i]);
            int profit = list.get(index).p;
            ans += profit;
        }
        
        return ans;
    }
    
    int bs(List<Pair> list, int maxDiff) {
        int lo = 0;
        int hi = list.size() - 1;
        
        while (lo < hi) {
            int mid = ((lo+hi)%2==1) ? ((lo+hi)>>1)+1 : (lo+hi)>>1; 
            
            if (list.get(mid).d > maxDiff) {
                hi = mid - 1;
            }
            else {
                lo = mid;
            }
        }
        
        return lo;        
    }
}
```