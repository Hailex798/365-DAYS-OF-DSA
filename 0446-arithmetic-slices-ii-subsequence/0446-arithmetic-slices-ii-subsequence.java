//OPTIMISED - 1(DYNAMIC PROGRAMMING: TUTORIAL)

class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int len = nums.length;
        int ans = 0;
        Map<Integer, Integer>[] map = new Map[len];
        
        for(int i=0 ; i<len ; i++){
            map[i] = new HashMap<>(i);
            for(int j=0 ; j<i ; j++){
                long diff = (long)nums[j] - nums[i];
                
                if(diff <= Integer.MIN_VALUE || diff > Integer.MAX_VALUE) continue;
                
                int diff2 = (int)diff;
                int n2 = map[i].getOrDefault(diff2, 0);
                int n1 = map[j].getOrDefault(diff2, 0);
                ans += n1;
                int freq = n1 + n2 + 1;
                map[i].put(diff2, freq);
            }
        }
        
        return ans;
    }
}