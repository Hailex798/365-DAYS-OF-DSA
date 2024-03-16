//OPTIMISED - 1(HASHMAP)

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int len = nums.length;
        
        for(int i=0 ; i<len ; i++){
            map.put(nums[i], i);
        }
        
        for(int i=0 ; i<len ; i++){
            int val = target - nums[i];
            if(map.containsKey(val) && map.get(val) != i){
                return new int[]{i, map.get(val)};
            }
        }
        
        return new int[]{0, 0};
    }
}