//BF - (COUNTING)

class Solution {
    public void sortColors(int[] nums) {
        int zero = 0;
        int ones = 0;
        
        //COUNTING 0'S & 1'S
        for(int i: nums){
            if(i == 0) zero++;
            if(i == 1) ones++;
        }
        
        //SORTING IN-PLACE BY FREQUENCY
        for(int i=0 ; i<nums.length ; i++){
            if(zero > 0){
                nums[i] = 0;
                zero--;
            }else if(ones > 0){
                nums[i] = 1;
                ones--;
            }else{
                nums[i] = 2;
            }
        }
        
        return ;
    }
}