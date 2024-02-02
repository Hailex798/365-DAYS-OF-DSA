//BRUTE FORCE - 1(ITERATION + ARRAY)

class Solution {
    public int findKthPositive(int[] arr, int k) {
        int len = arr.length;
        int x = 1;
        List<Integer> list = new ArrayList<>();
        
        for(int i=0 ; i<len ; x++){
            if(x != arr[i]){
                list.add(x);
            }else{
                i++;
            }
        }
        
        return list.size() >= k ? list.get(k-1) : arr[len-1]+k-list.size();
    }
}