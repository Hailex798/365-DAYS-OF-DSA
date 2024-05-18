//OPTIMISED - 1(DFS: PRE-ORDER TRAVERSAL)

class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> trav = new ArrayList<Integer>();
        preTrav(root, trav);
        
        return trav;
    }
    public void preTrav(TreeNode root, List<Integer> trav){
        if(root == null) return ;
        
        trav.add(root.val);
        preTrav(root.left, trav);
        preTrav(root.right, trav);
    }
}