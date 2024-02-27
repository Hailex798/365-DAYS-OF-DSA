//OPTIMISED - 1(POST-ORDER TRAVERSAL)

class Solution {
    private int res = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        diameter(root);
        return res;
    }
    public int diameter(TreeNode root){
        if(root == null) return 0;
        
        int Left = diameter(root.left);
        int Right = diameter(root.right);
        res = Math.max(res, Left + Right);
        
        return Math.max(Left, Right) + 1;
    }
}