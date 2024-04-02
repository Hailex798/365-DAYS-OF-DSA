//OPTIMISED - 1(SPLIT() METHOD)

class Solution {
    public int lengthOfLastWord(String s) {
        String[] str = s.split(" ", 0);
        
        return str[str.length - 1].length();
    }
}