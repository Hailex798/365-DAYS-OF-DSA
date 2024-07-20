class Solution {
    public String losingPlayer(int x, int y) {
        String ans = "Bob";
        
        while(x >= 1 && y >= 4){
            if(x >= 1 && y >= 4){
                x--;
                y -= 4;
                ans = ans.equals("Alice") ? "Bob" : "Alice";
            }else{
                break;
            }
        }
        
        return ans;
    }
}