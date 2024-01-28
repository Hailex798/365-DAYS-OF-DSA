//OPTIMISED - 1(BINARY SEARCH + HASHMAP + PAIR)

class TimeMap {
    Map<String, List<Pair<String, Integer>>> map;
    public TimeMap() {
        map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        //VALUES ARE ADDED BASED ON TIMESTAMP --> STRICTLY INCREASING ORDER
        if(!map.containsKey(key)){
            map.put(key, new ArrayList<>());
        }
        map.get(key).add(new Pair(value, timestamp));
    }
    
    public String get(String key, int timestamp) {
        if(!map.containsKey(key)) return "";
        
        List<Pair<String, Integer>> list = map.get(key);
        int index = binarySearch(list, timestamp);
        
        return index == -1 ? "" : list.get(index).getKey();
    }
    //BINARY SEARCHING THE INDEX OF ASKED TIMESTAMP
    private int binarySearch(List<Pair<String, Integer>> list, int target){
        int low = 0;
        int high = list.size() - 1;
        int idx = -1;
        
        while(low <= high){
            int mid = low + (high-low)/2;
            int val = list.get(mid).getValue();
            
            if(val == target){
                return mid;
            }else if(val < target){
                low = mid + 1;
                idx = mid;
            }else{
                high = mid - 1;
            }
        }
        return idx;
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */