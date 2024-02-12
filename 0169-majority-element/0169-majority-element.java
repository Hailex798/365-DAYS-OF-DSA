//BRUTE FORCE - 2(SORTING)

class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        if(len < 2) return nums[0];
        int count = 1;
        
        for(int i=1 ; i<len ; i++){
            if(nums[i] == nums[i-1]){
                count++;
                if(count > len/2) return nums[i];
            }else{
                count = 1;
            }
        }
        
        return -1;
    }
}