//BRUTE FORCE - 1(DOUBLE FOR)

class Solution {
    public int maxFrequencyElements(int[] nums) {
        int max = Integer.MIN_VALUE;
        
        //FINDING MAX FREQUENCY
        for(int i=0 ; i<nums.length ; i++){
            int freq = 0;
            for(int j=0 ; j<nums.length ; j++){
                if(nums[i] == nums[j]){
                    freq++;
                }
            }
            max = Math.max(max, freq);
        }
        
        //FINDING TOTAL NO. WITH SAME FREQUENCY
        int tot = 0;
        for(int i=0 ; i<nums.length ; i++){
            int freq = 0;
            for(int j=i ; j<nums.length ; j++){
                if(nums[i] == nums[j]){
                    freq++;
                }
            }
            if(freq == max) tot++;
        }
        
        return max*tot;
    }
}