//OPTIMISED - 1(SORTING)

class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        int len = arr.length;
        Arrays.sort(target);
        Arrays.sort(arr);
        
        for(int i=0 ; i<len ; i++){
            if(target[i] != arr[i]) return false;
        }
        
        return true;
    }
}