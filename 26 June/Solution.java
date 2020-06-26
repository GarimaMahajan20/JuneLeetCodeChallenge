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
    public int sumNumbers(TreeNode root) {
        List<Integer> l =new ArrayList<>();
        int data =0;
        path(root,data,l);
        int sum=0;
        for(int i :l){
            sum+=i;
        }
        return sum;
    }
    public void path(TreeNode root,int data, List<Integer> l){
        if(root==null){
            return;
        }
        if(root.left==null&&root.right==null){
            data=data*10+root.val;
            l.add(data);
            return;
        }
        else
        {
            data=data*10+root.val;
            path(root.left,data,l);
            path(root.right,data,l);
        }
        return;
    }
}