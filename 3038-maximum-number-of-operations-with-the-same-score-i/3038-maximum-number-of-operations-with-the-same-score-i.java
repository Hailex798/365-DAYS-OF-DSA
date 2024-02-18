//BRUTE FORCE - 1(CONTEST: ONE-PASS)

class Solution {
    public int maxOperations(int[] nums) {
        int len = nums.length;
        int count = 0;
        int score = nums[0] + nums[1];
        
        for(int i=0 ; i<len ; ){
            if(i+1 < len && score == nums[i] + nums[i+1]){
                count++;
                i += 2;
            }else{
                return count;
            }
        }
        
        return count;
    }
}