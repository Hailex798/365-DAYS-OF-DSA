//BF - 1(ITERATION)

class Solution {
    public void setZeroes(int[][] matrix) {
        int len = matrix.length;
        int n = matrix[0].length;
        
        for(int i=0 ; i<len ; i++){
            for(int j=0 ; j<n ; j++){
                if(matrix[i][j] == 0){
                    matrix[i][j] = 474836;
                    for(int x=0 ; x<Math.max(len, n) ; x++){
                        if(x < len){
                            matrix[x][j] = matrix[x][j] == 0 ? 0 : 474836;
                        } 
                        if(x < n){
                            matrix[i][x] = matrix[i][x] == 0 ? 0 : 474836;
                        }
                    }
                }
            }
        }
        

        for(int i=0 ; i<len ; i++){
            for(int j=0 ; j<n ; j++){
                if(matrix[i][j] == 474836) matrix[i][j] = 0;
            }
        }
        
        return ;
    }
}