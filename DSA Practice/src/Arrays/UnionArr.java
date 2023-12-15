package Arrays;

import java.util.*;

public class UnionArr {
    public static void main(String[] args) {
        int[] arr1 = { 2, 3, 6, 119, 232, 847 };
        int[] arr2 = { 5, 7, 119, 847 };
        System.out.println("After Union: " + (unionArray(arr1, arr2, arr1.length, arr2.length)));
    }

    /*
     * //Brute
     * static List<Integer> unionArray(int[] a, int[] b){
     * 
     * Set<Integer> set = new HashSet<>();
     * for(int i=0; i<a.length;i++)
     * set.add(a[i]);
     * 
     * for(int i=0; i<b.length;i++)
     * set.add(b[i]);
     * 
     * List<Integer> temp = new ArrayList<>(set.size());
     * for(int i :set)
     * temp.add(i);
     * 
     * return temp;
     * }
     */

    // Optimal
    static List<Integer> unionArray(int[] a, int[] b, int n, int m) {
        List<Integer> union = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (i < n && j < m) {
            if (a[i] <= b[j]) {
                if (union.size() == 0 || union.get(union.size() - 1) != a[i]) {
                    union.add(a[i]);
                }
                i++;
            } else {
                if (union.size() == 0 || union.get(union.size() - 1) != b[j]) {
                    union.add(b[j]);
                }
                j++;
            }
        }
        while (i < n) {
            if (union.get(union.size() - 1) != a[i]) {
                union.add(a[i]);
            }
            i++;
        }
        while (j < m) {
            if (union.get(union.size() - 1) != b[j]) {
                union.add(b[j]);
            }
            j++;
        }

        return union;
    }
}
