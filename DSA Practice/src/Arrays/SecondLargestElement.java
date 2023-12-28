package Arrays;

// Second largest Element in an Array

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] sample ={2,3,6,119,1,2,232,8,487, 239, 239, 487,7};
        int n = sample.length;
        System.out.println("Second largest element in Array is " + findSecondLargestElement(sample, n));
    }

    public static int findSecondLargestElement(int[] a, int n){
        int largest = a[0];
        int secondLargest = -1;

        for(int i=1; i<n; i++){
            if(a[i]>largest){
                secondLargest = largest;
                largest = a[i];
            }else if (a[i]>secondLargest && largest>a[i]) {
                        secondLargest = a[i];
            }
        }
        return secondLargest;
    }
}
