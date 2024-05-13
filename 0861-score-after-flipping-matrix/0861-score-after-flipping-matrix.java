//OPTIMISED - 1(SIMULATION)

class Solution {
    public int matrixScore(int[][] grid) {
        int rows = grid.length;
        
        for(int i=0 ; i<grid[0].length ; i++){
            int zeroes = 0;
            for(int j=0 ; j<rows ; j++){
                if(i == 0 && grid[j][i] == 0){
                    togRow(grid, j);
                }else if(grid[j][i] == 0){
                    zeroes++;
                }
            }
            //TOGGLING COLUMNS
            if(zeroes > (rows - zeroes)){
                togCol(grid, i);
            }
        }
        
        //CALCULATING SCORES
        int score = 0;
        
        for(int i=0 ; i<rows ; i++){
            int pow = 0;
            for(int j=grid[0].length-1 ; j>=0 ; j--){
                score += Math.pow(2, pow++) * grid[i][j];
                System.out.println(score);
            }
        }
        
        return score;
    }
    public void togRow(int[][] grid, int r){
        //TOGGLING VALUES
        for(int i=0 ; i<grid[0].length ; i++){
            grid[r][i] ^= 1;
        }
    }
    public void togCol(int[][] grid, int c){
        //TOGGLING VALUES
        for(int i=0 ; i<grid.length ; i++){
            grid[i][c] ^= 1;
        }
    }
}