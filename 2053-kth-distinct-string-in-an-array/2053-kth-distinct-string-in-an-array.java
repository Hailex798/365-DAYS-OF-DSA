//BRUTE FORCE - 1(DOUBLE-ITERATION)

class Solution {
    public String kthDistinct(String[] arr, int k) {
        int len = arr.length;
        
        for(int i=0 ; i<len ; i++){
            String dis = arr[i];
            boolean unique = true;
            
            for(int j=i+1 ; j<len ; j++){
                if(arr[j].equals(dis)){
                    arr[j] = "";
                    unique = false;
                }
            }
            
            if(unique && !dis.equals("")){
                k--;
            }
            if(k == 0) return dis;
        }
        
        return "";
    }
}