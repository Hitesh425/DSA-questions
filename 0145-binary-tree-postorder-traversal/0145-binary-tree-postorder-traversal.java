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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> lst = new ArrayList<>();
        if (root==null) return lst;
        Stack<TreeNode> stk1 = new Stack<>();
        Stack<TreeNode> stk2 = new Stack<>();
        stk1.push(root);
        while(!stk1.isEmpty()){
            root = stk1.pop();
            stk2.push(root);
            if (root.left!=null) stk1.push(root.left);
            if (root.right!=null) stk1.push(root.right);
        }
        while(!stk2.isEmpty()) lst.add(stk2.pop().val);
        return lst;
    }
}