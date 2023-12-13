package Arrays;

public class MinMaxElement {
    public static void main(String[] args) {
        int[] sample ={2,3,6,119,1,2,232,8,487, 239, 239, 487,7};
        int n = sample.length;
        System.out.println("Largest element in Array is " + findLargestElement(sample, n));
        System.out.println("Smallest element in Array is " + findSmallestElement(sample, n));
    }

    public static int findLargestElement(int[] a, int n){
        int largest = a[0];
        for(int i =0; i<n; i++){
            if(a[i]>largest){
                largest = a[i];
            }
        }
        return largest;
    }

    public static int findSmallestElement(int[] a, int n){
        int smallest = a[0];
         for(int i =0; i<n; i++){
            if(a[i]<smallest){
                smallest = a[i];
            }
        }
        return smallest;
    }
}
