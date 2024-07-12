//OPTIMISED - 1(GREEDY)

class Solution {
    public int jump(int[] nums) {
        int ans = 0;
        int left = 0;
        int right = 0;
        
        while(right < nums.length - 1){
            int far = left + nums[left];
            
            for(int i=left ; i<=right ; i++){
                far = Math.max(far, i + nums[i]);
            }
            left = right + 1;
            right = far;
            ans++;
        }
        
        return ans;
    }
}