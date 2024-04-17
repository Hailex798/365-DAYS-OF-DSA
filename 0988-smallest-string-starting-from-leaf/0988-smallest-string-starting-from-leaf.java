//OPTIMISED - 1.2(DFS)

class Solution {
    public String smallestFromLeaf(TreeNode root) {
        String smallest = "";
        smallest = dfs(root, "", smallest);
        
        return smallest;
    }
    
    public String dfs(TreeNode node, String curr, String smallest){
        if(node == null){
            return smallest;
        }
        
        curr = (char)(node.val + 'a') + curr;
        
        if(node.left == null && node.right == null){
            if(smallest == "" || curr.compareTo(smallest) < 0){
                smallest = curr;
            }
        }
        smallest = dfs(node.left, curr, smallest);
        smallest = dfs(node.right, curr, smallest);
        
        return smallest;
    }
}