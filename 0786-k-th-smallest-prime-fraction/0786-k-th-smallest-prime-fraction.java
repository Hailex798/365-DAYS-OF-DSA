//OPTIMISED - 1(TRAVERSAL)

class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        Map<Double, String> map = new HashMap<>();
        List<Double> list = new ArrayList<>();
        int len = arr.length;
        
        //MAPPING OUT THE VALUES OF FRACTIONAL PART WITH THEIR INTEGER VALUES
        for(int i=0 ; i<len ; i++){
            for(int j=i+1 ; j<len ; j++){
                double val = (double)arr[i]/arr[j];
                map.put(val, Integer.toString(arr[i]) + "/" + Integer.toString(arr[j]));
                list.add(val);
            }
        }
        
        //SORTING OUT FRACTIONAL VALUES IN NEW LIST
        Collections.sort(list);
        
        //REEDEMING THE VALUES
        int[] f = new int[2];
        String ans = map.get(list.get(k-1));
        int len1 = ans.length();
        String x = "";
        
        for(int i=0 ; i<len1 ; i++){
            if(ans.charAt(i) != '/')
                x += ans.charAt(i);
            else{
                f[0] = Integer.parseInt(""+x);
                x = "";
            }
        }
        f[1] = Integer.parseInt(""+x);
        
        return f;
            
        // return new int[] {Integer.parseInt(""+map.get(list.get(k-1)).charAt(0)), Integer.parseInt(""+map.get(list.get(k-1)).charAt(1))};
    }
}