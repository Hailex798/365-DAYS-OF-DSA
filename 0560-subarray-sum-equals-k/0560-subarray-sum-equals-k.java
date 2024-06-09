//BRUTE FORCE - 1(CALC SUBARR)

class Solution {
    public int subarraySum(int[] nums, int k) {
        int tot = 0;
        
        //CALC --> LOGIC
        for(int i=0 ; i<nums.length ; i++){
            int sum = 0;
            
            for(int j=i ; j<nums.length ; j++){
                sum += nums[j];
                if(sum == k) tot++;
            }
        }
        
        return tot;
        
    }
}