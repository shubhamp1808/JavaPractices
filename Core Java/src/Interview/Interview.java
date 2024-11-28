package Interview;

// Given the following sequence : [23, 45, 1, 78, 192, 63], find the number which is closest to the number 55.

// public int getNumberClosest(int[] arr, int target){}
public class Interview {
    public static void main(String[] args){
        // int arr[] = {23, 45, 1, 78, 192, 62};
        // int k = 55;
        // // int n = arr.length;

        // System.out.println(getNumberClosest(arr, k));

        // LinkedList linkedList = new LinkedList<>();

        // Node firstNode = new Node(1);
        // Node secondNode = new Node(2);
        // Node thirdNode = new Node(3);
        // linkedList
    }

    // public static int getNumberClosest(int[] arr, int target){
    //     //linear search

    //     int res = arr[0];
    //     for(int i =1; i<arr.length; i++){
    //         if(Math.abs(target-res)>Math.abs(target-arr[i])){  //
    //             res= arr[i];
    //         }
    //     }

    //     return res;
    // }


    class Node {
        int data;
        Node next;
        // Node(int d)
        // {
        //     data = d;
        //     next = null;
        // }

        // if loop exists
    // int isCyclic(Node node){
    // }

    Node top;

    public void push (int x){
        Node node = new Node();
        // if(node==null){
        //     return;
        // }

        node.data = x;
        node.next = top;
        top = node;
    }

    public void pop(){
        if(top == null){
            return;
        }

        top = top.next;
    }

    public int peek(){
        if(!(top==null)){
            return top.data;
        }
        return -1;
    }

}
}
