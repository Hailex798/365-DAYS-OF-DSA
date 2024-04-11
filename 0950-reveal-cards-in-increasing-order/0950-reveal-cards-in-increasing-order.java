//OPTIMISED - 1(TWO POINTERS)

class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        int n = deck.length;
        int[] ans = new int[deck.length];
        int pointer = 0;
        boolean skip = false;
        
        Arrays.sort(deck);
        
        while(pointer < n){
            for(int i=0 ; i<n ; i++){
                if(ans[i] == 0){
                    if(!skip){
                        ans[i] = deck[pointer++];
                    }
                    skip = (!skip);
                }
            }
        }
        
        return ans;
    }
}