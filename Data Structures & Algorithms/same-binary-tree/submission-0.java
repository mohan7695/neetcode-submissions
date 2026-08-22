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
                   public boolean isSameTree(TreeNode p, TreeNode q) {
                           // Step 1: If both nodes are null, the subtrees are structural matches
                                   if (p == null && q == null) {
                                               return true;
                                                       }
                                                               
                                                                       // Step 2: If only one node is null, or values don't match, they are different
                                                                               if (p == null || q == null || p.val != q.val) {
                                                                                           return false;
                                                                                                   }
                                                                                                           
                                                                                                                   // Step 3: Recursively check the left and right subtrees
                                                                                                                           return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
                                                                                                                               }
                                                                                                                               }
                                                                                                                               