package Arrays;

import java.util.*;

// Find the Intersection of two Arrays

public class IntersectionArr {
    public static void main(String[] args) {
        // int[] arr1 = { 2, 3, 6, 119, 232, 847 };
        // int[] arr2 = { 5, 7, 119, 847 };
        int[] arr1 = {1,2,2,1};
        int[] arr2 = {2,2};
        System.out.println("After Intersection: " + Arrays.toString(intersectionArray(arr1, arr2, arr1.length, arr2.length)));
    }

    /*
     * //Brute
     * static List<Integer> intersectionArray(int[] a, int[] b, int n, int m) {
     * List<Integer> ans = new ArrayList<>();
     * int[] visitedArr = new int[m];
     * for (int i = 0; i < visitedArr.length; i++) {
     * visitedArr[i] = 0;
     * }
     * for (int i = 0; i < n; i++) {
     * for (int j = 0; j < m; j++) {
     * if (a[i] == b[j] && visitedArr[j] == 0) {
     * ans.add(b[j]);
     * visitedArr[j] = 1;
     * }
     * }
     * }
     * return ans;
     * }
     */

    // Optimal
    // static List<Integer> intersectionArray(int[] a, int[] b, int n, int m) {
    //     List<Integer> ans = new ArrayList<>();
    //     int i = 0, j = 0;

    //     while (i < n && j < m) {
    //         if (a[i] < b[j]) {
    //             i++;
    //         } else if (b[j] < a[i]) {
    //             j++;
    //         } else {
    //             ans.add(a[i]);
    //             i++;
    //             j++;
    //         }
    //     }
    //     return ans;
    // }

    public static int[] intersectionArray(int[] nums1, int[] nums2, int n, int m) {
        List<Integer> ans = new ArrayList<>();
        Set<Integer> res = new HashSet<>();
        for(int i : nums1){
            res.add(i);
        }

        for (int i : nums2){
            if(res.contains(i)){
                ans.add(i);
                res.remove(i);
            }
        }

        int[] result = new int[ans.size()];
        for(int i=0; i<ans.size(); i++){
            result[i] = ans.get(i);
        }
        return result;
    }
}