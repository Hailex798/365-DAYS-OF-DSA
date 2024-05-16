// OPTIMISED - 1(DFS: POST-ORDER TRAVERSAL)

class Solution {
    public boolean evaluateTree(TreeNode root) {
        return dfs(root);
    }
    public boolean dfs(TreeNode root){
        if(root.left == null && root.right == null){
            return root.val == 1 ? true : false;
        }
        
        boolean lft = dfs(root.left);
        boolean rgt = dfs(root.right);
        
        boolean main = root.val == 2 ? lft || rgt : lft && rgt;
        
        return main;        
    }
}