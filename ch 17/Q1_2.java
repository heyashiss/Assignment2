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

public class BinarySearchTree {
    TreeNode root = null;

    public TreeNode create(int[] arr) {
        for (int i : arr) {
            root = insert(root, i);
        }
        return root;
    }

    public TreeNode insert(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }
        if (root.info >= val) {
            root.left = insert(root.left, val);
        }
        if (root.info < val) {
            root.right = insert(root.right, val);
        }
        return root;
    }

    public void preorder(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.info + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public void postorder(TreeNode root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.info + " ");
    }

    public void inorder(TreeNode root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.info + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in BST:");
        int numberOfElements = scanner.nextInt();
        int[] elements = new int[numberOfElements];
        System.out.println("Enter elements:");
        for (int i = 0; i < numberOfElements; i++) {
            elements[i] = scanner.nextInt();
        }
        BinarySearchTree bst = new BinarySearchTree();
        bst.root = bst.create(elements);
        System.out.println("InOrder:");
        bst.inorder(bst.root);
        System.out.println("\nPreOrder:");
        bst.preorder(bst.root);
        System.out.println("\nPostOrder:");
        bst.postorder(bst.root);
    }
}
