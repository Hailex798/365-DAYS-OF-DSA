//BRUTE FORCE - 1(SLIDING WINDOW)

class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return clss(nums, k) - clss(nums, k-1);
    }
    public int clss(int[] nums, int k){
        int n = nums.length;
        int wstart = 0;
        int wend = 0;
        int sub = 0;
        Map<Integer, Integer> map = new HashMap<>();
        
        while(wend < n){
            map.put(nums[wend], map.getOrDefault(nums[wend], 0) + 1);
            
            while(map.size() > k){
                map.put(nums[wstart], map.get(nums[wstart]) - 1);
                if(map.get(nums[wstart]) == 0){
                    map.remove(nums[wstart]);
                }
                wstart++;
            }
            sub += (wend - wstart + 1);
            wend++;
        }
        
        return sub;
    }
}