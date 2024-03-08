//OPTIMISED - 1(HASHMAP)

class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;
        
        // MAPPING FREQ
        for(int i: nums){
            map.put(i, map.getOrDefault(i, 0)+1);
            max = Math.max(max, map.get(i));
        }
        
        //FINDING ELEMENTS WITH SAME FREQ
        int tot = 0;
        for(int i: map.keySet()){
            if(max == map.get(i)) tot++;
        }
        
        return tot*max;
    }
}