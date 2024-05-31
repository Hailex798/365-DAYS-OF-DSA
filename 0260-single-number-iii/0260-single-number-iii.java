//BF - 2(FREQUENCY: HASHMAP)

class Solution {
    public int[] singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[2];
        int x = 0;
        
        //MAPPING FREQUENCY
        for(int i: nums){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        
        //CHECKING NO. W 1 FREQUENCY
        for(int i=0 ; i<nums.length ; i++){
            if(map.get(nums[i]) == 1){
                ans[x++] = nums[i];
            }
        }
        
        return ans;
    }
}