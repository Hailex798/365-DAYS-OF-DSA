//BF - 1(SORTING)

class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        int min = Integer.MAX_VALUE;
        int len = arr.length;
        
        Arrays.sort(arr);
        
        for(int i=1 ; i<len ; i++){
            min = Math.min(min, Math.abs(arr[i] - arr[i-1]));
        }
        
        List<List<Integer>> list = new ArrayList<>();
        
        for(int i=1 ; i<len ; i++){
            List<Integer> r = new ArrayList<>();
            if(Math.abs(arr[i] - arr[i-1]) == min){
                r.add(arr[i-1]);
                r.add(arr[i]);
                list.add(r);
            }
        }
        
        return list;
    }
}