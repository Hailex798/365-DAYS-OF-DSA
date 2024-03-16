//OPTIMISED - 1(ITERATION)

class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int sum = 0;
        
        for(int i=0 ; i<nums.length ; i++){
            int len = 0;
            int max = Integer.MIN_VALUE;
            for(char c: Integer.toString(nums[i]).toCharArray()){
                max = Math.max(max, Character.getNumericValue(c));
                len++;
            }
            String ans = "";
            for(int j=0 ; j<len ; j++){
                ans += max;
            }
            sum += Integer.parseInt(ans);
        }
        
        return sum;
    }
}