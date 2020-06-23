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
    public int countNodes(TreeNode root) {
        return internalnodes(root)+countleafnodes(root);
    }
    public int countleafnodes(TreeNode root){
        if(root==null)
            return 0;
        if(root.left==null&&root.right==null){
            return 1;
        }
        return (countleafnodes(root.left)+countleafnodes(root.right));
    }
    public int internalnodes(TreeNode root){
        if(root==null)
            return 0;
        if(root.left==null&&root.right==null){
            return 0;
        }
        return internalnodes(root.left)+internalnodes(root.right)+1;
    }
}