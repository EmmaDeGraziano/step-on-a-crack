package edu.sdccd.cisc191.template;
public class HighScoreControl {


    class BinaryTree<T> {
        class Node {
            T data;
            Node next;
            Node left;
            Node right;
            String item;

            public Node(T data, Node next) {
                this.data = data;
                this.next = next;
            }

            public Node(T data) {
                this.data = data;
            }

            public T getData() {
                return data;
            }
        }

        private boolean treeContains(Node root, String item) {
            if (root == null) {//if tree has nothing
                return false;
            } else if (item.equals(root.item)) {//items in root node.
                return true;
            } else if (item.compareTo(root.item) < 0) {
                // If the item occurs, it must be in the left subtree.
                return treeContains(root.left, item);
            } else {
                // If the item occurs, it must be in the right subtree.
                return treeContains(root.right, item);
            }
        }  // end treeContains()

        private void treeInsert(Node root, String newItem) {
            ;

            if (root == null) {
                // The tree is empty.  Set root to point to a new node containing
                // the new item.  This becomes the only node in the tree.
                return;
            }
            Node runner;  // Runs down the tree to find a place for newItem.
            runner = root;   // Start at the root.
            while (true) {
                if (newItem.compareTo(runner.item) < 0) {//if less than, goes left. open speace, new ndode. no sace, drop.

                    if (runner.left == null) {
                        runner.left = new Node((T) newItem);
                        return;  // New item has been added to the tree.
                    } else
                        runner = runner.left;
                } else {//greater or equal is RIGHT. if open, adds a node. if not, runner drops.
                    if (runner.right == null) {
                        runner.right = new Node((T) newItem);
                        return;  // New item has been added to the tree.
                    } else
                        runner = runner.right;
                }
            } // end while
        }  // end treeInsert()

        void printNode(Node root) {
            if (root != null) {  //otherwise no printing will happen.
                printNode(root.left);   // Print items in left subtree.
                System.out.print(root.item + " ");  // Print the root item.
                printNode(root.right);  // Print items in right subtree.
            }
        } // end printNode()
    }
}
