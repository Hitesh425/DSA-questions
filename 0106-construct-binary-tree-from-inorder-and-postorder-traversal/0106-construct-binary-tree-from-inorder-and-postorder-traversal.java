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
    static int idx;
    static public TreeNode build(int[] in, int[] post, int start, int end){
        if (start>end) return null;
        TreeNode root = new TreeNode(post[idx--]);
        int mid = start;
        while(in[mid]!=root.val){
            mid++;
        }
        root.right=build(in,post,mid+1,end);
        root.left=build(in,post,start,mid-1);
        return root;
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int N = inorder.length;
        if (N==0) return null;
        idx = N-1;
        return build(inorder,postorder,0,N-1);
    }
}