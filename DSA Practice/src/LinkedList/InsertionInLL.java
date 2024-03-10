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
public class InsertionInLL {
    public static void main(String[] args) {
        int[] arr = {2, 3, 7, 18, 5, 9, 12};
        Node head = new Node(arr[0]);
        head.next = new Node(arr[1]);
        head.next.next = new Node(arr[2]);
        head.next.next.next = new Node(arr[3]);
        head.next.next.next.next = new Node(arr[4]);
        head.next.next.next.next.next = new Node(arr[5]);
        head.next.next.next.next.next.next = new Node(arr[6]);

        // Node addHead = insertHead(head, 11);
        // printLL(addHead);

        System.out.println(" ");

        // Node addTail = insertTail(head, 17);
        // printLL(addTail);

        System.out.println(" ");

        // Node addIndex = insertIndex(head, 5, 17);
        // printLL(addIndex);

        Node addValue = insertValue(head, 5, 22);
        printLL(addValue);
    }

    private static void printLL(Node head) {
        Node temp = head;
        while(temp!= null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }

    private static Node insertHead(Node head, int value) {
        return new Node(value, head);
    }

    private static Node insertTail(Node head, int value) {

        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        Node newNode = new Node(value);
        temp.next = newNode;
        return head;
    }

    private static Node insertIndex(Node head, int index, int value) {
        if(head==null) return head;
        if(index==1){
            return new Node(value, head);
        }

        int cnt = 0;
        Node temp = head;
        while(temp!=null){
            cnt++;

            if(cnt==index-1){
                Node newNode = new Node(value, temp.next);
                temp.next = newNode;
                break;
            }
            temp = temp.next;
        }
        return head;
    }

    private static Node insertValue(Node head, int existingValue, int value) {
        if(head == null) return head;

        Node temp = head;
        Node prev = null;
        while (temp!=null) {
            if(temp.data==existingValue){
                Node newNode = new Node(value, prev.next);
                prev.next = newNode;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }
}
