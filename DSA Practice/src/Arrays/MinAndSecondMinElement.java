package Arrays;

import java.util.Arrays;

public class MinAndSecondMinElement {
    public static void main(String[] args) {
        // int[] sample ={3,2, 0,6,119,1,2,232,8,487, 239, 239, 487,7};
        int[] sample ={2, 4, 3, 5, 6};
        // int[] sample ={1,1,1,1,1};
        int n = sample.length;
        System.out.println("Largest element in Array is " + Arrays.toString(findSmallestAndSecondSmallestElement(sample, n)));
    }

    public static int[] findSmallestAndSecondSmallestElement(int[] a, int n){
        int[] temp = {-1};
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        if(a.length<2) return temp;

        for(int i=1; i<n; i++){
            if(a[i]<smallest){
                secondSmallest = smallest;
                smallest= a[i];
            }else if (a[i] != smallest && a[i]<secondSmallest) {
                secondSmallest = a[i]; 
            }
        }

        temp = new int[]{smallest, secondSmallest};

        return (temp);
    }
}
