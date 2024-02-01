//OPTIMISED - 1(SORTING + ADDING)

class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int len = nums.length;
        int[][] ans = new int[len/3][3];
        int x = 0;
        
        for(int i=0 ; i<len ; ){
            int[] temp = new int[3];
            
            for(int j=0 ; j<3 ; j++){                
                temp[j] = nums[i++];
            }
            Arrays.sort(temp);
            if(Math.abs(temp[0]-temp[2]) > k) return new int[][] {};
            
            ans[x++] = temp;
        }
        
        return ans;
    }
}