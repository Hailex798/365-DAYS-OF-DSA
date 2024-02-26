//OPTIMISED - 1(DFS: INORDER TRAVERSAL)

class Solution {
    public boolean isSameTree(TreeNode root, TreeNode root2) {
        if(root == null && root2 == null) return true;
        if(root == null || root2 == null) return false;
        
        return isSameTree(root.left, root2.left) && (root.val == root2.val) && isSameTree(root.right, root2.right);
    }
}