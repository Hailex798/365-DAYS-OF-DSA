//BRUTE FORCE - 1(HASHMAP)

class Solution {
    public int majorityElement(int[] nums) {
        int len = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        
        //STORING FREQ
        for(int i: nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        
        //GETTING [n/2] ELEMENT
        for(int i: nums){
            if(map.get(i) > len/2) return i;
        }
        
        return 0;
    }
}