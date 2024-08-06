class Solution {
    public int[] sortArray(int[] nums) {
        nums = mergeSort(nums);
        
        return nums;
    }
    
    //MERGE SORT -> MAIN IMPLEMENTATION
    public int[] mergeSort(int[] arr){
        int len = arr.length;
        if(len == 1){
            return arr;
        }
        int mid = len/2;
        
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, len));
        
        return merge(left, right);
    }
    
    public static int[] merge(int[] left, int[] right){
        int[] mix = new int[left.length + right.length];
        
        int x = 0;
        int i = 0;
        int j = 0;
        
        while(i < left.length && j < right.length){
            if(left[i] < right[j]){
                mix[x] = left[i++];
            }else{
                mix[x] = right[j++];
            }
            x++;
        }
        
        while(i < left.length){
            mix[x++] = left[i++];
        }
        
        while(j < right.length){
            mix[x++] = right[j++];
        }
        
        return mix;
    }
}