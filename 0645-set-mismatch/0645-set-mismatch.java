//OPTIMISED - 1(HASHSET: DOUBLE-PASS)

class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] ans = new int[2];
        Set<Integer> set = new HashSet<>();
        
        //ADDING IN SET
        for(int i: nums){
            if(set.contains(i)){
                ans[0] = i;
            }else{
                set.add(i);   
            }
        }
        
        for(int i=1 ; i<=nums.length ; i++){
            if(!set.contains(i)) ans[1] = i;
        }
        
        return ans;
    }
}