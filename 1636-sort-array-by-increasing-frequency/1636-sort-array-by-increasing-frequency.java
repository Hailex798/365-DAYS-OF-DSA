//OPTIMISED - 1(CUSTOMISED SORTING: LAMBDA FUNCTION)

class Solution {
    public int[] frequencySort(int[] nums) {
        int len = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i: nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        
        //MAKING NUMS OBJECT FOR LAMBDA SORTING FUNC
        Integer[] numsObj = new Integer[len];
        
        for(int i=0 ; i<len ; i++){
            numsObj[i] = nums[i];
        }
        
        Arrays.sort(numsObj, (a, b) -> {
            if(map.get(a) == map.get(b)){
                return Integer.compare(b, a);
            }
            
            return Integer.compare(map.get(a), map.get(b));
        });
        
        for(int i=0 ; i<len ; i++){
            nums[i] = numsObj[i];
        }
        
        return nums;        
    }
}