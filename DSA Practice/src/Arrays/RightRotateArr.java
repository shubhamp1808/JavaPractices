package Arrays;

import java.util.Arrays;

//Right rotate an array by 1 or K place

public class RightRotateArr {
    public static void main(String[] args) {
        int[] sample ={2,3,6,119,1,2,232,8,4,7};
        int n = sample.length;
        int d = 4;
        System.out.println("After rotating right: " + Arrays.toString(rotateArray(sample, n, d)));
    }

    static int[] rotateArray(int[] a, int n, int d){
        d = d%n;
        reverseArray(a, 0, n-d-1);
        reverseArray(a, n-d, n-1);
        reverseArray(a, 0, n-1);
        return a;
    }

    public static void reverseArray(int[] a, int start, int end){
        while(start<=end){
            int temp= a[start];
            a[start] = a[end];
            a[end]=temp;
            start++;
            end--;
        }
    }
}
