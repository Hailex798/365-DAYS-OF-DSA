//OPTIMISED - 1(BINARY SEARCH)

class Pair{
    int val; 
    int sid;

    public Pair(int sid, int val){
        this.sid = sid;
        this.val = val;
    }
}
class SnapshotArray {
    HashMap<Integer, List<Pair>> map; 
    int snapId; 

    public SnapshotArray(int length) {
        map = new HashMap<>(); 
        snapId = 0;

        for(int i=0; i<length; i++){
            List<Pair> list = new ArrayList<>(); 
            list.add(new Pair(0, 0)); 
            map.put(i, list); 
        }

    }
    
    public void set(int index, int val) {
        List<Pair> list = map.get(index);
        int n = list.size(); 

        if(list.get(n-1).sid == snapId){
            Pair p = list.get(n-1); 
            p.val = val; 
        }
        else{
             list.add(new Pair(snapId, val)); 
        }
         
        map.put(index, list);  
    }
    
    public int snap() {
        snapId++; 
        return snapId - 1; 
    }
    
    public int get(int index, int snap_id) {
        List<Pair> list = map.get(index);
        return binarySearch(list, snap_id);  
    }
    //BINARY SEARCH
    public int binarySearch(List<Pair>list, int key){
        int low = 0; 
        int high = list.size()-1; 
        int ans = -1; 

        while(low <= high){
            int mid = low + (high - low)/2; 
            Pair p = list.get(mid);
            
            if(p.sid == key){
                return p.val; 
            }
            else if(p.sid > key){
                high = mid-1; 
            }
            else{
                ans = p.val;
                low = mid + 1; 
            }
        }
        return ans; 
    }
}