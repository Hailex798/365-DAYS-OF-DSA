//OPTIMISED - 1(DFS)

class Solution {
    String smallest = "";
    public String smallestFromLeaf(TreeNode root) {
        dfs(root, "");
        
        return smallest;
    }
    
    public void dfs(TreeNode node, String curr){
        if(node == null){
            return ;
        }
        
        curr = (char)(node.val + 'a') + curr;
        
        if(node.left == null && node.right == null){
            if(smallest == "" || curr.compareTo(smallest) < 0){
                smallest = curr;
            }
        }
        if(node.left != null){
            dfs(node.left, curr);
        }
        if(node.right != null){
            dfs(node.right, curr);
        }
    }
}