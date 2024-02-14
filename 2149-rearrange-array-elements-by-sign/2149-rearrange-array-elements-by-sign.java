//BRUTE FORCE - 1(ARRAYLIST)

class Solution {
    public int[] rearrangeArray(int[] nums) {
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();
        
        //STORING POSITIVE AND NEGATIVE INTEGERS IN ORDER
        for(int i: nums){
            if(i > 0) pos.add(i);
            else neg.add(i);
        }
        
        //RE-ARRAGING ARRAY IN SAME ORDER
        int a = 0;
        int b = 0;
        for(int i=0 ; i<nums.length ; i++){
            if((i&1) == 0) nums[i] = pos.get(a++);
            else nums[i] = neg.get(b++);
        }
        
        return nums;
    }
}