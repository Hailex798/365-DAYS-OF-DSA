//OPTIMISED - 1(DFS: POST-ORDER TRAVERSAL)

class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> trav = new ArrayList<Integer>();
        postTrav(root, trav);
        
        return trav;
    }
    public void postTrav(TreeNode root, List<Integer> trav){
        if(root == null) return ;
        
        postTrav(root.left, trav);
        postTrav(root.right, trav);
        trav.add(root.val);
    }
}