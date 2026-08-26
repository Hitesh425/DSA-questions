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
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> lst = new ArrayList<>();
        Stack<TreeNode> stk = new Stack<>();
        if (root==null) return lst;
        stk.push(root);
        while(!stk.isEmpty()){
            root = stk.pop();
            lst.add(root.val);
            if (root.right!=null) stk.push(root.right);
            if (root.left!=null) stk.push(root.left);
        }
        return lst;
    }
}