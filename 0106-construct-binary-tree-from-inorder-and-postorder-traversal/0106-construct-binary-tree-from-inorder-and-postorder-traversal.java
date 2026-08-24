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
    public TreeNode build(int[] inorder, int instart, int inend, int[] postorder, int poststart, int postend, HashMap<Integer,Integer> map){
        if (instart>inend || poststart>postend) return null;
        TreeNode node = new TreeNode(postorder[postend]);
        int inidx = map.get(node.val);
        int numsleft = inidx-instart;
        node.left = build(inorder,instart,inidx-1,postorder,poststart,poststart+numsleft-1,map);
        node.right = build(inorder,inidx+1,inend, postorder,poststart+numsleft,postend-1,map);
        return node;
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder.length==0 || postorder.length==0 || inorder.length!=postorder.length) return null;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i=0; i<inorder.length; i++){
            map.put(inorder[i],i);
        }
        return build(inorder,0,inorder.length-1,postorder,0,postorder.length-1,map);
    }
}