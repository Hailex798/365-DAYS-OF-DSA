class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int m = matrix.length; int n = matrix[0].length;
        Map<Integer, Integer> minRow = new HashMap<>();
        Map<Integer, Integer> maxCol = new HashMap<>();
        
        for(int i=0 ; i<m ; i++){
            for(int j=0 ; j<n ; j++){
                minRow.put(i, Math.min(matrix[i][j], minRow.getOrDefault(i, Integer.MAX_VALUE)));
                maxCol.put(j, Math.max(matrix[i][j], maxCol.getOrDefault(j, Integer.MIN_VALUE)));
            }
        }
        
        for(int i=0 ; i<m ; i++){
            for(int j=0 ; j<n ; j++){
                if(matrix[i][j] == minRow.get(i) && matrix[i][j] == maxCol.get(j)) res.add(matrix[i][j]);
            }
        }
        
        return res;
    }
}