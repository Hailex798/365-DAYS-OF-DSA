//OPTIMISED - 1(TWO-POINTER)

class Solution {
    public int minimumLength(String s) {
        int len = s.length();
        int i = 0;
        int j = len - 1;
        char[] str = s.toCharArray();
        
        while(i <= j){
            if(str[i] != str[j]) break;
            if(i == j) return 1;
            
            char c = str[i];
            while(i <= j && str[i] == c) i++;
            while(i <= j && str[j] == c) j--;
        }
        
        return j-i+1;
    }
}