//OPTIMISED - 2(SELF)

class Solution {
    public int findCenter(int[][] edges) {
        Map<Integer, Integer> map = new HashMap<>();
        
        //MAPPED FREQUENCIES
        for(int[] ed: edges){
            int first = map.getOrDefault(ed[0], 0);
            if(first != 0) return ed[0];
            int second = map.getOrDefault(ed[1], 0);
            if(second != 0) return ed[1];
            map.put(ed[0], first+1);
            map.put(ed[1], second+1);
        }
        
        if(map.get(edges[0][0]) == edges.length) return edges[0][0];
        if(map.get(edges[0][1]) == edges.length) return edges[0][1];
        
        return 1;
    }
}