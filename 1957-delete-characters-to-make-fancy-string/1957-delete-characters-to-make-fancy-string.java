//BF - 1(STRING LOGIC)

class Solution {
    public String makeFancyString(String s) {
        StringBuilder ans = new StringBuilder();
        char x = s.charAt(0);
        int count = 0;
        
        for(char c: s.toCharArray()){
            if(c == x) count++;
            else{
                count = 1;
                x = c;
            }
            
            if(count < 3) ans.append(c);
        }
        
        return ans.toString();
    }
}