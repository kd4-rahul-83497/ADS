package com.assignment.a6;

class TreeNode {
    int data;
    TreeNode left, right;

    TreeNode(int data) {
        this.data = data;
        left = right = null;
    }
}

class BinarySearchTree {
    TreeNode root;

    BinarySearchTree() {
        root = null;
    }

    // Recursive function to add a node to the BST
    TreeNode addNode(TreeNode root, int data) {
        if (root == null) {
            root = new TreeNode(data);
            return root;
        }

        if (data < root.data)
            root.left = addNode(root.left, data);
        else if (data > root.data)
            root.right = addNode(root.right, data);

        return root;
    }

    // Wrapper for addNode to simplify usage
    void addNode(int data) {
        root = addNode(root, data);
    }

    // Recursive function to search a value in the BST
    boolean search(TreeNode root, int data) {
        if (root == null) return false;

        if (root.data == data) return true;

        if (data < root.data)
            return search(root.left, data);
        else
            return search(root.right, data);
    }

    // Wrapper for search to simplify usage
    boolean search(int data) {
        return search(root, data);
    }

    // Function to find the inorder successor
    TreeNode inorderSuccessor(TreeNode root) {
        TreeNode current = root;
        while (current != null && current.left != null) {
            current = current.left;
        }
        return current;
    }

    // Function to delete a node with two children
    TreeNode deleteNode(TreeNode root, int data) {
        if (root == null) return null;

        if (data < root.data) {
            root.left = deleteNode(root.left, data);
        } else if (data > root.data) {
            root.right = deleteNode(root.right, data);
        } else {
            // Node with two children
            if (root.left != null && root.right != null) {
                TreeNode successor = inorderSuccessor(root.right);
                root.data = successor.data;
                root.right = deleteNode(root.right, successor.data);
            } else if (root.left != null) {
                return root.left;
            } else {
                return root.right;
            }
        }
        return root;
    }

    // Wrapper for deleteNode to simplify usage
    void deleteNode(int data) {
        root = deleteNode(root, data);
    }

    // Function to perform inorder traversal
    void inorderTraversal(TreeNode root) {
        if (root != null) {
            inorderTraversal(root.left);
            System.out.print(root.data + " ");
            inorderTraversal(root.right);
        }
    }

    // Wrapper for inorderTraversal to simplify usage
    void inorderTraversal() {
        inorderTraversal(root);
        System.out.println();
    }
}

public class bstTreeMain {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        int[] values = {33, 31, 34, 35, 39, 32, 36, 38, 37, 30};

        for (int value : values) {
            bst.addNode(value);
        }

        System.out.println("Inorder traversal:");
        bst.inorderTraversal();

        int searchValue = 35;
        System.out.println("Searching for " + searchValue + ": " + bst.search(searchValue));

        int deleteValue = 34;
        System.out.println("Deleting node with value " + deleteValue + " (node with two children):");
        bst.deleteNode(deleteValue);

        System.out.println("Inorder traversal after deletion:");
        bst.inorderTraversal();
    }
}

