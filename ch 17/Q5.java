public class SortedArrayToBST {
    public static void main(String[] args) {
        int[] sortedArray = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        SortedArrayToBST converter = new SortedArrayToBST();
        TreeNode root = converter.convertToBST(sortedArray, 0, sortedArray.length - 1);
        converter.inorderTraversal(root);
    }

    public TreeNode convertToBST(int[] arr, int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = (start + end) / 2;
        TreeNode current = new TreeNode(arr[mid]);
        current.left = convertToBST(arr, start, mid - 1);
        current.right = convertToBST(arr, mid + 1, end);
        return current;
    }

    public void inorderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        inorderTraversal(root.left);
        System.out.print(root.value + " ");
        inorderTraversal(root.right);
    }
}

class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;

    TreeNode(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}
