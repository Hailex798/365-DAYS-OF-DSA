//OPTIMISED - 1(TWO POINTERS)

class Solution {
    public String reversePrefix(String word, char ch) {
        int idx = word.indexOf(ch);
        
        if(idx == -1) return word;
        
        char[] arr = word.toCharArray();
        
        int i=0;
        
        while(i<idx){
            char temp = arr[i];
            arr[i++] = arr[idx];
            arr[idx--] = temp;
        }
        
        return String.valueOf(arr);
    }
}