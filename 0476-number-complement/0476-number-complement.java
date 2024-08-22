//OPTIMISED - 3(BIT COUNT)

class Solution {
    public int findComplement(int num){
        String ans = "";
        String str = Integer.toBinaryString(num);
        
        for(int i=str.length()-1 ; i>=0 ; i--){
            ans = ((str.charAt(i) - '0') ^ 1) + ans;
        }
        
        return Integer.parseInt(ans, 2);
    }
}