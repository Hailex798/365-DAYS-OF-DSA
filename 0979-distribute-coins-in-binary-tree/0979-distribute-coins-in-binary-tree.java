//OPTIMISED - 1(DFS: POST-ORDER TRAVERSAL)

class Solution {
    private int move = 0;
    public int distributeCoins(TreeNode root) {
        dfs(root);
        
        return move;
    }
    public int dfs(TreeNode root){
        if(root == null) return 0;
        
        int lcoin = dfs(root.left);
        int rcoin = dfs(root.right);
        
        move += Math.abs(lcoin) + Math.abs(rcoin);
        
        return (root.val - 1) + rcoin + lcoin;
    }
}