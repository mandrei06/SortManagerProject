package com.sparta.sortmanager.model;

import com.sparta.sortmanager.logging.LogDriver;

public class BinarySearchTree extends SortMethod {
    public static int i = 0;
    public static int size = 0;
    public static int[] sortedArray;

    /* Class containing left
      and right child of current node
    * and key value*/
    static class Node {
        int key;
        Node left, right;

        public Node(int item) {
            key = item;
            left = right = null;
        }
    }

    // Root of BST
    Node root;

    // This method mainly calls insertRec()
    void insert(int key) {
        root = insertRec(root, key);
    }

    /* A recursive function to
       insert a new key in BST */
    Node insertRec(Node root, int key) {

        /* If the tree is empty,
           return a new node */
        if (root == null) {
            root = new Node(key);
            return root;
        }

        /* Otherwise, recur down the tree */
        if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);

        /* return the (unchanged) node pointer */
        return root;
    }

    // This method mainly calls InorderRec()
    int[] inorder() {
        return inorderRec(root);
    }

    // A utility function to
    // do inorder traversal of BST
    int[] inorderRec(Node root) {


        if (root != null) {
            inorderRec(root.left);
            // System.out.println(root.key);
            sortedArray[i] = root.key;
            i++;
            inorderRec(root.right);
        }
        return sortedArray;
    }


    public static int[] nodesInsert(int[] array) {
        BinarySearchTree tree = new BinarySearchTree();
        size = array.length;
        sortedArray = new int[size];

        /* Let us create following BST
              50
           /     \
          30      70
         /  \    /  \
       20   40  60   80 */
        for (int element : array) {
            tree.insert(element);
        }
        // print inorder traversal of the BST
        sortedArray = tree.inorder();
        return sortedArray;
    }

    public int[] sort(int[] array) {
        int[] sortedArray = nodesInsert(array);
        LogDriver.logger.info("Binary Search Tree ran successfully!");
        return sortedArray;
    }


}
