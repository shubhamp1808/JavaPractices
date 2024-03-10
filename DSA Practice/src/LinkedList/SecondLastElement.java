package LinkedList;

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

public class SecondLastElement {
    public static void main(String[] args) {
        int[] arr = {2, 3, 7, 18, 5, 9, 12};
        Node head = new Node(arr[0]);
        head.next = new Node(arr[1]);
        head.next.next = new Node(arr[2]);
        head.next.next.next = new Node(arr[3]);
        head.next.next.next.next = new Node(arr[4]);
        head.next.next.next.next.next = new Node(arr[5]);
        head.next.next.next.next.next.next = new Node(arr[6]);

        System.out.println(getSecondLastElement(head));
    }

    private static int getSecondLastElement(Node head) {
        Node temp = head;
        while (temp!=null) {
            if(temp.next.next==null){
                return temp.data;
            }
            temp = temp.next;
        }
        return 0;
    }
}
