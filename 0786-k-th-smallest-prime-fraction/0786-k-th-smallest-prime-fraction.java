//OPTIMISED - 2(TRAVERSAL)

class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        Map<Double, int[]> map = new HashMap<>();
        List<Double> list = new ArrayList<>();
        int len = arr.length;
        
        //MAPPING OUT THE VALUES OF FRACTIONAL PART WITH THEIR INTEGER VALUES
        for(int i=0 ; i<len ; i++){
            for(int j=i+1 ; j<len ; j++){
                double val = (double)arr[i]/arr[j];
                map.put(val, new int[] {arr[i], arr[j]});
                list.add(val);
            }
        }
        
        //SORTING OUT FRACTIONAL VALUES IN NEW LIST
        Collections.sort(list);
            
        return map.get(list.get(k-1));
    }
}