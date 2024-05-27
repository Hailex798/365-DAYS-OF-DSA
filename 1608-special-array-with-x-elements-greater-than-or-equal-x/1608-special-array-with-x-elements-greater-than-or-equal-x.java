//OPTIMISED - 2(PREFIX-SUM + COUNTING)

class Solution {
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        int[] freq = new int[nums.length+1];
        
        //MAPPING FREQUENCIES
        for(int i: nums){
            freq[Math.min(nums.length, i)]++;
        }
        
        //CHECKING IF X ELEMENTS >= TO X VALUE
        int pSum = 0;
        for(int i=nums.length ; i>=1 ; i--){
            pSum += freq[i];
            if(pSum == i) return i;
        }
        
        return -1;
    }
}