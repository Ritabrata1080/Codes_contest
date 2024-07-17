package leetcode;

import java.util.*;
class Solution {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    TreeNode helper(TreeNode root, HashSet<Integer> set, List<TreeNode> res){
        if(root == null)
            return null;
        root.left = helper(root.left, set, res);
        root.right = helper(root.right, set, res);
        if(set.contains(root.val)){
            if(root.left != null)
                res.add(root.left);
            if(root.right != null)
                res.add(root.right);
            root = null;
        }
        return root;
    }
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<to_delete.length; i++){
            set.add(to_delete[i]);
        }
        List<TreeNode> res = new ArrayList<>();
        TreeNode node = helper(root, set, res);
        if(node != null)
            res.add(node);
        return res;
    }
}
