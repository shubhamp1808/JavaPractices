package Arrays;

import java.util.Arrays;

public class RemDuplicatesSortedArr {
    public static void main(String[] args) {
        int[] sample ={2,3,3,119,119,847,847,847};
        int n = sample.length;
        System.out.println("After removing duplicates: " + Arrays.toString(remDuplicates(sample, n)));
    }

    public static int[] remDuplicates(int[] a, int n){
        int i=0;
            for(int j=1; j<n;j++){
                if(a[i]!=a[j]){
                    a[i+1]=a[j];
                    i++;
                }
            }
            System.out.println("number of unique elements:" +(i+1));
        return a;
    }
}
