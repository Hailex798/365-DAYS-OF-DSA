//OPTIMISED - 1(PREFIX CHECKER)

class Solution {
    public String longestCommonPrefix(String[] strs) {
        int min = strs[0].length();
        
        for(int i=0 ; i<1 ; i++){
            for(int j=i+1 ; j<strs.length ; j++){
                min = Math.min(min, commonPrefix(strs[i], strs[j]));
            }
        }
        
        return strs[0].substring(0, min);
    }
    private static int commonPrefix(String str1, String str2) {
        int i = 0;
        while (i < str1.length() && i < str2.length() && str1.charAt(i) == str2.charAt(i)) {
            i++;
        }
        return i;
    }
}