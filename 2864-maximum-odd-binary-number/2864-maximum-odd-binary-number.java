//BRUTE FORCE - 1(BASIC STRING LOGIC)

class Solution {
    public String maximumOddBinaryNumber(String s) {
        int ones = 0;
        int len = s.length();
        
        //COUNTING TOTAL ONES IN THE STRING
        for(char c: s.toCharArray()){
            if(c == '1') ones++;
        }
        
        //CREATING MAX STRING
        boolean flag = true;
        char[] max = new char[len];
        for(int i=0 ; i<len ; ){
            if(flag){
                max[--len] = '1';
                ones--;
                flag = false;
            }else if(ones > 0){
                max[i++] = '1';
                ones--;
            }else{
                max[i++] = '0';
            }
        }
        String ans = new String(max);
        return ans;
    }
}