//OPTIMISED - 1(LIST: STREAMS)

class Solution {
    public int[] sortedSquares(int[] nums) {
        List<Integer> list = new ArrayList<>();
        
        for(int i: nums){
            list.add(i*i);
        }
        Collections.sort(list);
        
        return list.stream().mapToInt(i->i).toArray();
    }
}