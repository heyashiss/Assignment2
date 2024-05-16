import java.util.Scanner;

class TreeNode {
    int info;
    TreeNode left;
    TreeNode right;

    public TreeNode(int info) {
        this.info = info;
        this.left = null;
        this.right = null;
    }
}

public class BinarySearchTreeDeletion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the BST:");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        BinarySearchTreeDeletion obj = new BinarySearchTreeDeletion();
        TreeNode root = obj.createBST(arr);
        System.out.print("Enter the node to delete: ");
        int key = scanner.nextInt();
        root = obj.deleteNode(root, key);
        obj.inorderTraversal(root);
    }

    public int findMin(TreeNode root) {
        if (root == null) {
            return -1;
        }
        TreeNode current = root;
        while (current.left != null) {
            current = current.left;
        }
        return current.info;
    }

    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return root;
        }
        if (root.info > key) {
            root.left = deleteNode(root.left, key);
        } else if (root.info < key) {
            root.right = deleteNode(root.right, key);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            root.info = findMin(root.right);
            root.right = deleteNode(root.right, root.info);
        }
        return root;
    }

    public TreeNode createBST(int[] arr) {
        if (arr == null || arr.length == 0)
            return null;

        TreeNode root = new TreeNode(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            root = insertNode(root, arr[i]);
        }
        return root;
    }

    public TreeNode insertNode(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }
        if (root.info >= val) {
            root.left = insertNode(root.left, val);
        } else {
            root.right = insertNode(root.right, val);
        }
        return root;
    }

    public void inorderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        inorderTraversal(root.left);
        System.out.print(root.info + " ");
        inorderTraversal(root.right);
    }
}
