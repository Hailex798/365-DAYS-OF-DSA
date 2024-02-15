//OPTIMISED - 1(PREFIX SUM)

class Solution {
    public long largestPerimeter(int[] nums) {
        int len = nums.length;
        long[] dnums = new long[len];
        
        Arrays.sort(nums);
        
        dnums[0] = (long)nums[0];
        //PREFIX SUM
        for(int i=1 ; i<len ; i++){
            dnums[i] = (long)(nums[i] + dnums[i-1]);
        }
        
        //CHECKING THE ANS FROM BACK
        for(int j=len-1 ; j>0 ; j--){
            if(dnums[j] - dnums[j-1] < dnums[j-1]) return dnums[j];
        }
        
        return -1;
    }
}