class KthLargest {
    
    List<Integer> stream;
    int k = 0;

    public KthLargest(int k, int[] nums) {
        stream = new ArrayList<Integer>();
        this.k = k;
        
        for(int i: nums){
            stream.add(i);
        }
        Collections.sort(stream);
    }
    
    public int add(int val) {
        stream.add(getIndex(val), val);
        
        int ans = stream.get(stream.size() - this.k);
        
        return ans;
    }
    
    public int getIndex(int val){
        int low = 0;
        int high = stream.size() - 1;
        
        while(low <= high){
            int mid = low + (high-low)/2;
            
            if(stream.get(mid) == val) return mid;
            
            if(stream.get(mid) > val){
                high = mid-1;
            }else if(stream.get(mid) < val){
                low = mid + 1;
            }
        }
        
        return low;
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */