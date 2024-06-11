//BRUTE FORCE - 1(HARD-CODED)

class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int pointer = 0;
        int len1 = arr1.length;
        int[] arr = new int[len1];
        
        //RELATIVELY SORTING THE DISTINCT NO. FRONT ARR2
        for(int i=0 ; i<arr2.length ; i++){
            for(int j=0 ; j<len1 ; j++){
                if(arr2[i] == arr1[j]){
                    arr[pointer++] = arr1[j];
                    arr1[j] = -1;
                } 
            }
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i: arr1){
            if(i > -1) list.add(i);
        }
        Collections.sort(list);
        
        for(int i: list){
            arr[pointer++] = i;
        }
        
        return arr;
    }
}