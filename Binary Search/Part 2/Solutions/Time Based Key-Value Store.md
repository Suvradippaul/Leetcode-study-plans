```
class Pair {
    int time;
    String value;
    Pair(int t, String s) {
        this.time = t;
        this.value = s;
    }
}

class TimeMap {
    HashMap<String, List<Pair>> map;
    public TimeMap() {
        map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        if (!map.containsKey(key)) {
            map.put(key, new ArrayList<>());
        }
        map.get(key).add(new Pair(timestamp, value));
    }
    
    public String get(String key, int timestamp) {
        if (!map.containsKey(key)) return "";
        return bs(map.get(key), timestamp);
    }
    
    String bs(List<Pair> list, int target) {
        int lo = 0;
        int hi = list.size()-1;
        
        while (lo < hi) {
            int mid = ((lo+hi)%2==1) ? ((lo+hi)>>1)+1 : (lo+hi)>>1;
			
			if (target < list.get(mid).time) {
				hi = mid - 1;
			}
			else {
				lo = mid;
			}
        }
        
        return list.get(lo).time <= target ? list.get(lo).value : "";
    }
}
```