package Practices;

// Better is the Optimal soln for the array with positives & negatives elements

public class LongestSubArrayWithGivenSum {
    public static void main(String[] args) {
        int[] sample = { 1, 2, 3, 1, 1, 1, 1, 4, 2, 3 };
        int n = sample.length;
        int k = 3;
        System.out.println(findLongestSubarray(sample, n, k));
    }

    // Brute --> O(n^3)/O(1) OR O(n^2)/O(1)
    // static int findLongestSubarray(int[] a, int n, int k) {
    // int maxLen = 0;
    // for (int i = 0; i < n; i++) {
    // int sum = 0;
    // for (int j = i; j < n; j++) {
    // // int sum = 0;
    // // for (int m = i; m <= j; m++) {
    // // sum += a[m];
    // // }
    // sum += a[j];
    // if (sum == k)
    // maxLen = Math.max(maxLen, j - i + 1);
    // }
    // }
    // return maxLen;
    // }

    // Better --> O(N)/O(N)
    // static int findLongestSubarray(int[] a, int n, int k) {
    // int maxLen = 0;
    // int sum = 0;
    // HashMap<Integer, Integer> preSumMap = new HashMap<>();
    // for (int i = 0; i < n; i++) {
    // sum += a[i];

    // if (sum == k) {
    // maxLen = Math.max(maxLen, i + 1);
    // }

    // int rem = sum - k;

    // if (preSumMap.containsKey(rem)) {
    // int len = i - preSumMap.get(rem);
    // maxLen = Math.max(maxLen, len);
    // }

    // if (!preSumMap.containsKey(sum)) {
    // preSumMap.put(sum, i);
    // }
    // }
    // return maxLen;
    // }

    // Optimal --> O(2N)/O(1)
    static int findLongestSubarray(int[] a, int n, int k) {
        int maxLen = 0;
        int sum = a[0];
        int left = 0, right = 0;
        while (right < n) {
            while (left <= right && sum > k) {
                sum -= a[left];
                left++;
            }
            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }
            right++;
            if (right < n)
                sum += a[right];
        }

        return maxLen;
    }
}
