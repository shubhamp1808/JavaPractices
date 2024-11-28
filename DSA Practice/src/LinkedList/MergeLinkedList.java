package LinkedList;

public class MergeLinkedList {
    public static void main(String[] args) {
        // merge sorted linked list
    }
}

class Node {
    int data;
    Node next;

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}