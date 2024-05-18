//OPTIMISED - 1(DFS: IN-ORDER TRAVERSAL)

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> arr = new ArrayList<>();

        InTrav(root, arr);
        return arr;
    }
    public void InTrav(TreeNode root, List<Integer> trav){
        if(root == null) return ;
        
        InTrav(root.left, trav);
        trav.add(root.val);
        InTrav(root.right, trav);
    }
}