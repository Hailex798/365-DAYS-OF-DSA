class Solution {
    public boolean divideArray(int[] nums) {
        int[] map = new int[501];

        //Mapping Frequency
        for(int i: nums){
            map[i] += 1;
        }

        //Checking if there is Odd Frequency of Element (will not get equal pair)
        for(int i: map){
            if((i & 1) == 1) return false;
        }
        return true;
    }
}