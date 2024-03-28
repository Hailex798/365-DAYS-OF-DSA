//OPTIMISED - 2(SLIDING WINDOW)

class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int n = nums.length;
        int len = 0;
        int wstart = 0;
        int wend = 0;
        Map<Integer, Integer> map = new HashMap<>();
        
        while(wend < n){
            map.put(nums[wend], map.getOrDefault(nums[wend], 0) + 1);

            //WINDOW SHRINK
            while(map.get(nums[wend]) > k){
                map.put(nums[wstart], map.get(nums[wstart])-1);
                if(map.get(nums[wstart]) == 0){
                    map.remove(nums[wstart]);
                }
                wstart++;
            }
            len = Math.max(len, wend-wstart+1);
            wend++;
        }
        
        return len;
    }
    
    //CHECK FOR ARRAY --> GOOD ? 
//     public boolean goodArr(Map<Integer, Integer> map, int k){
//         for(int i: map.keySet()){
//             if(map.get(i) > k) return false;
//         }
        
//         return true;
//     }
}