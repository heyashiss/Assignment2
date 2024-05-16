import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeValidator {
    TreeNode root = null;

    public static void main(String[] args) {
        int[] values = {4, 2, 5, 1, 3};
        BinaryTreeValidator validator = new BinaryTreeValidator();
        validator.createBinaryTree(values);
        System.out.println("Is it a Binary Search Tree? " + validator.checkIfBST(validator.root, Integer.MIN_VALUE, Integer.MAX_VALUE));
    }

    public boolean checkIfBST(TreeNode root, int min, int max) {
        if (root == null) {
            return true;
        }
        if (root.info < min || root.info > max) {
            return false;
        }
        return checkIfBST(root.left, min, root.info) && checkIfBST(root.right, root.info, max);
    }

    public void createBinaryTree(int[] values) {
        if (values == null || values.length == 0)
            return;

        root = new TreeNode(values[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        for (int i = 1; i < values.length; i++) {
            TreeNode parent = queue.poll();

            if (values[i] != -1) {
                parent.left = new TreeNode(values[i]);
                queue.offer(parent.left);
            }

            if (++i < values.length && values[i] != -1) {
                parent.right = new TreeNode(values[i]);
                queue.offer(parent.right);
            }
        }
    }
}

class TreeNode {
    int info;
    TreeNode left, right;

    TreeNode(int info) {
        this.info = info;
        left = right = null;
    }
}
