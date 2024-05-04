//OPTIMISED - 1(TWO-POINTER + GREEDY)

class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int len = people.length;
        int boat = 0;
        
        int i=0; int j=len-1;
        
        while(i<=j){
            if(people[i] + people[j] <= limit) i++;
            j--; boat++;
        }
        
        return boat;
    }
}