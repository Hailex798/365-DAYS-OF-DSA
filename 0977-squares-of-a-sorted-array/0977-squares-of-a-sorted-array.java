//OPTIMISED - 1(TWO POINTERS: )

class Solution {
    public int[] sortedSquares(int[] nums) {
        int low = 0;
        int len = nums.length;
        int[] ans = new int[len];
        int high = len - 1;
        int x = len - 1;
        
        while(low <= high){
            if(nums[low]*nums[low] > nums[high]*nums[high]){
                ans[x] = nums[low]*nums[low];
                low++;
            }else{
                ans[x] = nums[high]*nums[high];
                high--;
            }
            x--;
        }
        
        return ans;
    }
}