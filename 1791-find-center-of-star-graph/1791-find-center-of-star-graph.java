//OPTIMISED - 3(SELF)

class Solution {
    public int findCenter(int[][] edges) {
        Map<Integer, Integer> map = new HashMap<>();
        
        if(edges[1][0] == edges[0][0] || edges[1][0] == edges[0][1]) return edges[1][0];
        if(edges[1][1] == edges[0][0] || edges[1][1] == edges[0][1]) return edges[1][1];
        
        return 1;
    }
}