//OPTIMISED - 1(DFS)

class Solution {
    public int sumNumbers(TreeNode node){
        return dfs(node, 0);
    }
    
    public int dfs(TreeNode root, int pthSum) {
        if(root == null){
            return 0;
        }
        
        pthSum = pthSum * 10 + root.val;
        
        if(root.left == null && root.right == null){
            return pthSum;
        }
        
        return dfs(root.left, pthSum) + dfs(root.right, pthSum);
    }
}