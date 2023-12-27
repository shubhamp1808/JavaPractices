package Arrays;

import java.util.Arrays;
import java.util.HashSet;

/*
You are given an integer array of N positive elements. Any integer in the array can occur multiple times. 
Your task is to find all the distinct duplicate elements and store them in an array in increasing order and then 
finally return this array as the output.
Note: If there are no duplicate elements in the integer array, then the output should be (-1).
 */

public class ArrayOfDuplicatesEle {
    public static void main(String[] args) {
        int[] sample = { 1, 2, 2, 3, 4, 5, 6, 7, 7 };
        int n = sample.length;
        System.out.println(Arrays.toString(findDistinctDuplicates(sample, n)));
    }

    // Brute O(nlogn)/O(n)
    // static int[] findDistinctDuplicates(int [] a, int n){
    // Arrays.sort(a);
    // List<Integer> duplicates = new ArrayList<>();

    // for(int i=1; i<n; i++){
    // if((a[i]==a[i-1]) && !duplicates.contains(a[i])){
    // duplicates.add(a[i]);
    // }
    // }
    // if(duplicates.size()<2){
    // return new int[]{-1};
    // }

    // int[] result = new int[duplicates.size()];
    // for(int i=0; i<duplicates.size(); i++){
    // result[i] = duplicates.get(i);
    // }
    // return result;
    // }

    // O(n)/O(n)
    // static int[] findDistinctDuplicates(int[] a, int n){
    // Arrays.sort(a);
    // HashMap<Integer, Integer> duplicates = new HashMap<>();

    // for(int x : a){
    // duplicates.put(x, duplicates.getOrDefault(x, 0)+1);
    // }
    // int count = 0;
    // int[] result = new int[duplicates.size()];
    // for(int x : a){
    // if((duplicates.get(x)!=null) && duplicates.get(x)==2){
    // result[count++]=x;
    // duplicates.remove(x);
    // }
    // }
    // if (count >= 2) {
    // return Arrays.copyOf(result, count);
    // } else {
    // return new int[]{-1};
    // }
    // }

    // O(n+k)/O(n)
    static int[] findDistinctDuplicates(int[] a, int n) {
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> dups = new HashSet<>();

        for (int x : a) {
            if (!seen.add(x))
                dups.add(x);
        }
        int count = 0;
        int[] result = new int[dups.size()];
        for (int x : dups) {
            result[count++] = x;
        }
        if (count >= 2) {
            return result;
        } else {
            return new int[] { -1 };
        }
    }

}