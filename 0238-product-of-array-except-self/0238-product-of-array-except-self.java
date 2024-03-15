//OPTIMISED - 1(PREFIX + POSTFIX)

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] prefix = new int[len];
        int[] postfix = new int[len];
        
        //PREFIX PRODUCT
        Arrays.fill(prefix, 1);
        prefix[0] = nums[0];
        for(int i=1 ; i<nums.length ; i++){
            prefix[i] = nums[i] * prefix[i-1];
        }
        
        //POSTFIX PRODUCT
        Arrays.fill(postfix, 1);
        postfix[len-1] = nums[len-1];
        for(int i=len-2 ; i>=0 ; i--){
            postfix[i] = nums[i] * postfix[i+1];
        }
        
        nums[0] = postfix[1];
        nums[len-1] = prefix[len-2];
        
        for(int i=1 ; i<len-1 ; i++){
            nums[i] = prefix[i-1] * postfix[i+1];
        }
        
        return nums;
    }
}