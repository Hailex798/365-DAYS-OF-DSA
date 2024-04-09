//OPTIMISED - 1.3(COUNTING)

class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int time = 0;
        int ele = tickets[k];
        
        for(int i=0 ; i<tickets.length ; i++){
            if(i > k) time += Math.min(ele - 1, tickets[i]);
            else time += Math.min(ele, tickets[i]); 
            
        }
        return time;
    }
}
