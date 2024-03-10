package LinkedList;

class Node {
    int data;
    Node next;

    Node(int head, Node next){
        this.data = head;
        this.next = next;
    }

    Node(int head){
        this.data = head;
        this.next = null;
    }
}

@SuppressWarnings("unused")
public class DeletionInLL {
    public static void main(String[] args) {
        int[] arr = {2, 3, 7, 18, 5, 9, 12};
        Node head = new Node(arr[0]);
        head.next = new Node(arr[1]);
        head.next.next = new Node(arr[2]);
        head.next.next.next = new Node(arr[3]);
        head.next.next.next.next = new Node(arr[4]);
        head.next.next.next.next.next = new Node(arr[5]);
        head.next.next.next.next.next.next = new Node(arr[6]);

        Node remHead = removeHead(head);
        printLL(remHead);

        System.out.println("");

        // Node remTail = removeTail(head);
        // printLL(remTail);

        System.out.println("");
    
        // Node remIndex = removeIndex(head, 16);
        // printLL(remIndex);
        
        System.out.println("");

        // Node remValue = removeValue(head, 5);
        // printLL(remValue);
    }

    private static void printLL(Node head) {
        Node temp = head;
        while(temp!= null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }

    private static Node removeHead(Node head) {
        if(head == null) return head;
        head = head.next;
        return head;
    }

    private static Node removeTail(Node head) {
        if(head == null || head.next == null) return head;
        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }

    private static Node removeIndex(Node head, int index) {
        if(head == null) return head;

        if(index == 1) {
            head = head.next;
            return head;
        }

        int cnt = 0;

        Node temp = head;
        Node prev = null;
        while (temp!=null) {
            cnt++;
            if(cnt == index){
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }

    private static Node removeValue(Node head, int value) {
        if(head == null) return null;

        if(head.data == value){
            head = head.next;
            return head;
        }

        Node temp = head;
        Node prev = null;
        while (temp!=null) {
            if (temp.data == value) {
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }

        return head;
    }
}
