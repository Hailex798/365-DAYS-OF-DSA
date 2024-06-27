//OPTIMISED - 1(SELF)

class Solution {
    public int findCenter(int[][] edges) {
        Map<Integer, Integer> map = new HashMap<>();
        
        //MAPPED FREQUENCIES
        for(int[] ed: edges){
            map.put(ed[0], map.getOrDefault(ed[0], 0)+1);
            map.put(ed[1], map.getOrDefault(ed[1], 0)+1);
        }
        
        if(map.get(edges[0][0]) == edges.length) return edges[0][0];
        if(map.get(edges[0][1]) == edges.length) return edges[0][1];
        
        return 1;
    }
}