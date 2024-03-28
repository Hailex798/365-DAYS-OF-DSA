//OPTIMISED - 1(SLIDING WINDOW)

class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k <= 1) return 0;
        int pro = 1;
        int n = nums.length;
        int wstart = 0;
        int wend = 0;
        int sub = 0;
        
        //SLIDING WINDOW
        while(wend < n){
            pro *= nums[wend];
            
            while(pro >= k){
                pro /= nums[wstart++];
            }
            sub += wend - wstart + 1;
            wend++;
        }
        
        return sub;
    }
}