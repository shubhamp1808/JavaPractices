package Arrays;

// Check if Array is sorted

public class IfArraySorted {
    public static void main(String[] args) {
        int[] sample ={2,3,6,119,232,847};
        int n = sample.length;
        System.out.println("Is array sorted: " + findIfSorted(sample, n));
    }

    public static boolean findIfSorted(int[] a, int n){
        if(n==0 || n==1)
        return true;

        for(int i=1; i<n; i++){
            if(a[i-1]>a[i])
            return false;
        }
        return true;
    }
}
