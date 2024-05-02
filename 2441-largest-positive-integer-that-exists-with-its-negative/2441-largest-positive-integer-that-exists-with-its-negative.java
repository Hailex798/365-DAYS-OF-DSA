//OPTIMISED - 1(HASHMAP)

class Solution {
    public int findMaxK(int[] nums) {
        Set<Integer> set = new HashSet<>();
        
        //ADDING -VE VALUES TO HASHSET
        for(int i: nums){
            if(i < 0) set.add(i);
        }
        
        int max = -1;
        for(int i=0 ; i<nums.length ; i++){
            if(nums[i] > 0){
                if(nums[i] > max && set.contains(-nums[i])){
                    max = nums[i];
                }
            }
        }
        
        return max;
    }
}