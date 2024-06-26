//OPTIMISED - 1(DFS)

class Solution {
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        return dfs(root, target);
    }
    public TreeNode dfs(TreeNode root, int target){
        if(root == null){
            return null;
        }
        root.left = dfs(root.left, target);
        root.right = dfs(root.right, target);
        
        if(root.left == null && root.right == null && root.val == target){
            return null;
        }
        
        return root;
    }
}