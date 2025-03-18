class Solution {
    public int longestNiceSubarray(int[] nums) {
        int len = nums.length;
        int wstart = 0, wend = 0;
        int maxNice = 0;
        int bitMask = 0;

        while(wend < len){
            //Shifting the Window until, it does not satisfy the condn (no common value)
            while((bitMask & nums[wend]) != 0){
                bitMask ^= nums[wstart];
                wstart++;
            }

            //Updating current value to bitMask
            bitMask |= nums[wend];
            //Updating the length
            maxNice = Math.max(maxNice, wend - wstart + 1);

            //Shifting the Window forward
            wend++;
        }

        return maxNice;
    }
}