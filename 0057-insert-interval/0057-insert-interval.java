class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> mergeInt = new ArrayList<>();
        
        for(int[] nums: intervals){
            if(newInterval[1] < nums[0]){
                mergeInt.add(newInterval);
                newInterval = nums;
            }
            else if(newInterval[0] > nums[1]){
                mergeInt.add(nums);
            }
            else{
                newInterval[0] = Math.min(newInterval[0], nums[0]);
                newInterval[1] = Math.max(newInterval[1], nums[1]);
            }
        }
        
        mergeInt.add(newInterval);
        
        return mergeInt.toArray(new int[mergeInt.size()][]);
    }
}