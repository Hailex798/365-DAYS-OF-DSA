class Solution {
    public int longestNiceSubarray(int[] nums) {
        int maxNice = 1;
        int len = nums.length;
        

        for(int i=0 ; i<len ; i++){
            int max = 1;
            int bitMask = nums[i];
            for(int j=i+1 ; j<len ; j++){
                  if((bitMask & nums[j]) != 0) break;

                  bitMask |= nums[j];
                  max++;
            }
            maxNice = Math.max(maxNice, max);
        }

        return maxNice;
    }
}