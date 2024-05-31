//BF - 1(SORTING)

class Solution {
    public int[] singleNumber(int[] nums) {
        Arrays.sort(nums);
        int[] ans = new int[2];
        int len = nums.length;
        int x = 0;
        
        for(int i=0 ; i<len ; i++){
            if(i == len-1){
                ans[x++] = nums[i];
            }else if(nums[i] != nums[i+1]){
                ans[x++] = nums[i];
            }else{
                i += 1;
            }
        }
        
        return ans;
    }
}