import javax.swing.tree.TreeNode;

public class BST2GST {
     public TreeNode convertBST(TreeNode root) {
        TreeNode cur = root;
        int sum = 0;
        while (cur != null) {
            if (cur.right != null) { // traverse right subtree.
                TreeNode leftMost = cur.right;
                while (leftMost.left != null && leftMost.left != cur) { // locate the left-most node of cur's right subtree.
                    leftMost = leftMost.left;
                }
                if (leftMost.left == null) { // never visit the left-most node yet.
                    leftMost.left = cur; // construct a way back to cur.
                    cur = cur.right; // explore right.
                }else { // visited leftMost already, which implies now on way back.
                    leftMost.left = null; // cut off the fabricated link.
                    sum += cur.val; // update sum.
                    cur.val = sum; // update node value.
                    cur = cur.left; // continue on way back.
                }
            }else { // no right child: 1) cur is the right-most of unvisited nodes; 2) must traverse left.
                sum += cur.val; // update sum.
                cur.val = sum; // update node value.
                cur = cur.left; // continue on way back.
            }
        }
        return root;
    }
}
