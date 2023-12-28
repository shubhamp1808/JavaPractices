package Arrays;

import java.util.Arrays;

//Left rotate an array by 1 or K place

public class LeftRotateArr {
    public static void main(String[] args) {
        int[] sample ={2,3,6,119,1,2,232,8,4,7};
        int n = sample.length;
        int d = 4;
        if(d==1)
        System.out.println("After rotating left: " + Arrays.toString(rotateArray(sample, n)));
        else
        System.out.println("After rotating left: " + Arrays.toString(rotateArray(sample, n, d)));
    }

    //1 place
    public static int[] rotateArray(int[] a, int n){
        int temp=a[0];
        for(int i=1; i<n; i++){
            a[i-1]=a[i];
        }
        a[n-1]=temp;
        return a;
    }

    /*
    //K place (Brute)
    public static int[] rotateArray(int[] a, int n, int d){
        d = d%n;
        int temp[] = new int[d];
        for(int i=0; i<d; i++){
            temp[i]=a[i];
        }

        for(int i=d; i<n;i++){
            a[i-d]=a[i];
        }

        for(int i=(n-d); i<n; i++){
            a[i]=temp[i-(n-d)];
        }
        return a;
    }  */

    //K place (Optimal)
    public static int[] rotateArray(int[] a, int n, int d){
        d = d%n;
        reverseArray(a, 0, d-1);
        reverseArray(a, d, n-1);
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
