class Solution {
    public int minOperations(String[] logs) {
        int root = 0;
        
        for(String log: logs){
            if(log.charAt(1) == '.') root = root > 0 ? --root : 0;
            else if(log.charAt(0) != '.') root++;
        }
        
        return root;
    }
}