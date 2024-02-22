//OPTIMISED - 2(HASHSET)

class Solution {
    public int findJudge(int n, int[][] trust) {
        Set<Integer> set = new HashSet<>();
        
        //ADDING ALL THE N PEOPLE
        for(int i=1 ; i<=n ; i++){
            set.add(i);
        }
        
        //REMOVING EVERYBODY WHO TRUSTS ANYONE
        for(int[] i: trust){
            set.remove(i[0]);
        }
        
        Iterator<Integer> iterator = set.iterator();
        if(set.isEmpty()) return -1;
        
        //CHECKING CONDN. 2 --> IF EVERYBODY TRUST THE POTENTIAL JUDGE
        int val = iterator.next();
        
        for(int[] i: trust){
            if(i[1] == val) n--;
        }
        
        return n == 1 ? val : -1;
    }
}