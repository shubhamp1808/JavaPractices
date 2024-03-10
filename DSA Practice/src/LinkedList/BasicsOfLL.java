package LinkedList;

class Node{
    int data;
    Node next;

    Node(int data1){
        this.data = data1;
        this.next = null;
    }

    Node(int data1, Node next1){
        this.data = data1;
        this.next = next1;
    }
}

public class BasicsOfLL {
    public static void main(String[] args) {
        int[] arr = {12,5,8,7,88};
        Node head = convert2LL(arr);
        Node temp = head;
        while(temp!= null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println(" ");
        System.out.println("Length:: "+lengthOfLL(head));
        int val = 13;
        System.out.println(val +" is present "+checkIfPresent(head,val));
    }

    public static Node convert2LL(int[] arr){
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i=1; i<arr.length; i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    private static int lengthOfLL(Node head){
        int cnt = 0;
        Node temp = head;
        while(temp!= null){
            temp = temp.next;
            cnt++;
        }
        return cnt;
    }

    public static boolean checkIfPresent(Node head, int val){
        Node temp = head;
        while(temp != null){
            if (temp.data == val) return true;
            temp = temp.next;
        }
        return false;
    }
}
