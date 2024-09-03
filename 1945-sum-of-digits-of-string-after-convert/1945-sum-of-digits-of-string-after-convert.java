//OPTIMSED - 1(DOUBLE-FOR)

class Solution {
    public int getLucky(String s, int x) {
        String temp = "";
        
        //CREATING INITIAL STRING
        for(char c: s.toCharArray()){
            temp += Integer.toString(c - 'a' + 1);
        }
        
        int len = temp.length();
        int k = 0;
        
        int ans = 0;
        
        
        while(x-- > 0){
            while(k < len){
                ans += Integer.parseInt(temp.charAt(k++) + "");
            }
            temp = Integer.toString(ans);
            ans = 0;
            len = temp.length();
            k = 0;
        }
        
        return Integer.parseInt(temp);
    }
}