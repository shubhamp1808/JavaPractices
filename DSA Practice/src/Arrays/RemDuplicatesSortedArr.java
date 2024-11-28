package Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// Remove duplicates from a sorted Array

public class RemDuplicatesSortedArr {
    public static void main(String[] args) {
        int[] sample ={2,3,3,119,119,847,847,847};
        int n = sample.length;
        System.out.println("After removing duplicates: " + Arrays.toString(remDuplicatesUsingSet(sample, n)));
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

    public static int[] remDuplicatesUsingSet(int[] arr, int n){

        Set<Integer> set = new HashSet<>();
        for(int a : arr){
            set.add(a);
        }

        int i=0;
        if(!set.isEmpty()){
            for(int a : set){
                arr[i] = a;
                i++;
            }
        }

        return arr;
    }
}
