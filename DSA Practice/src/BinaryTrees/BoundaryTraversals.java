package BinaryTrees;

import java.util.*;

// Node structure for the binary tree
class Node {
    int data;
    Node left;
    Node right;

    // Constructor to initialize
    // the node with a value
    Node(int val) {
        data = val;
        left = null;
        right = null;
    }
}

public class BoundaryTraversals {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(7);
        root.left.left = new Node(3);
        root.left.left.right = new Node(4);
        root.left.left.right.left = new Node(5);
        root.left.left.right.right = new Node(6);
        root.right.left = new Node(8);
        root.right.left.right = new Node(9);
        root.right.left.right.left = new Node(10);
        root.right.left.right.right = new Node(11);

        BoundaryTraversals solution = new BoundaryTraversals();
        List<Integer> result = solution.printBoundary(root);

        System.out.print("Boundary Traversal: ");
        solution.printResult(result);
    }

    void printResult(List<Integer> result) {
        for (int val : result) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    static boolean isLeaf(Node root) {
        if (root.left == null && root.right == null) {
            return true;
        }
        return false;
    }

    List<Integer> printBoundary(Node root) {
        List<Integer> result = new ArrayList<>();
        if (root == null)
            return result;

        if (!isLeaf(root)) {
            result.add(root.data);
        }

        addLeftBoundary(root, result);
        addLeaves(root, result);
        addRightBoundary(root, result);

        return result;
    }

    static void addLeftBoundary(Node root, List<Integer> res) {
        Node curr = root.left;

        while (curr != null) {
            if (!isLeaf(curr)) {
                res.add(curr.data);
            }

            if (curr.left != null) {
                curr = curr.left;
            } else {
                curr = curr.right;
            }
        }
    }

    static void addLeaves(Node root, List<Integer> res) {
        if (isLeaf(root)) {
            res.add(root.data);
        }

        if (root.left != null) {
            addLeaves(root.left, res);
        }
        if (root.right != null) {
            addLeaves(root.right, res);
        }
    }

    static void addRightBoundary(Node root, List<Integer> res) {
        Node curr = root.right;
        Stack<Node> st = new Stack<>();

        while (curr != null) {
            if (!isLeaf(curr)) {
                st.push(curr);
            }

            if (curr.right != null) {
                curr = curr.right;
            } else {
                curr = curr.left;
            }
        }
        int i = st.size();

        while (i > 0) {
            res.add(st.pop().data);
            i--;
        }
    }
}
