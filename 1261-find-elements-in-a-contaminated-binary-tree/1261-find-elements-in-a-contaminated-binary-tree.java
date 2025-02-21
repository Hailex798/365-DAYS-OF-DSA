/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class FindElements {
    HashSet<Integer> seen;

    public FindElements(TreeNode root) {
        seen = new HashSet<>();
        dfs(root, 0);
    }
    
    public boolean find(int target) {
        return seen.contains(target);
    }

    private void dfs(TreeNode node, int value){
        if(node == null) return;

        //Assigning before contamination value ->
        node.val = value;
        //Storing the value in HashSet
        seen.add(value);

        //Passing down the left + right node along with their values ->
        dfs(node.left, 2 * value + 1);
        dfs(node.right, 2 * value + 2);
    }
}

/**
 * Your FindElements object will be instantiated and called as such:
 * FindElements obj = new FindElements(root);
 * boolean param_1 = obj.find(target);
 */