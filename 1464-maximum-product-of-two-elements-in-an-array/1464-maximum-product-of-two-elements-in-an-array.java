class Solution {
    public int maxProduct(int[] nums) {
        int max = 0;
        int fin = 0;

        for(int i=0 ; i<nums.length-1 ; i++){
            int product = 0;
            for(int j=i+1 ; j<nums.length ; j++){
                product = nums[i] * nums[j];
                if(max < product){
                    max = product;
                    fin = (nums[i]-1) * (nums[j]-1);
                }
            }
        }

        return fin;
    }
}