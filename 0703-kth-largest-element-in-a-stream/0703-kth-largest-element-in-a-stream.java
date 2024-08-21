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
        stream.add(val);
        Collections.sort(stream);
        
        int ans = stream.get(stream.size() - this.k);
        
        return ans;
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */