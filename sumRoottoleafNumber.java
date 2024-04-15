/**
 * sumRoottoleafNumber
 */
public class sumRoottoleafNumber {

    public int sumNumbers(TreeNode root) {
       
        return  sumOfPath(root, 0);
    }

    public static int sumOfPath(TreeNode root, int currSum) {
        if (root == null) {
            return 0;
        }
        currSum = currSum * 10 + root.val;
        if (root.left == null && root.right == null) {
           
            return currSum;
        }
       return sumOfPath(root.left, currSum)+ sumOfPath(root.right, currSum);
    }
    
}