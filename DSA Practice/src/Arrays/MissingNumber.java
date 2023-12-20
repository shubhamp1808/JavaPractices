package Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] sample = { 1, 2, 4, 5 };
        int n = 5;
        System.out.println("Missing element in Array is " + (missingNum(sample, n)));
    }

    /*
     * // Brute
     * static int missingNum(int[] a, int n) {
     * for (int i = 1; i <= n; i++) {
     * int flag = 0;
     * for (int j = 0; j < n - 1; j++) {
     * if (a[j] == i) {
     * flag = 1;
     * break;
     * }
     * }
     * if (flag == 0) {
     * return i;
     * }
     * }
     * return -1;
     * }
     */

    /*
     * // Better
     * static int missingNum(int[] a, int n) {
     * int hash[] = new int[n + 1];
     * 
     * for (int i = 0; i < n - 1; i++) {
     * hash[a[i]] = 1;
     * }
     * 
     * for (int i = 1; i <= n; i++) {
     * if (hash[i] == 0) {
     * return i;
     * }
     * }
     * return -1;
     * }
     */

    /*
     * // Optimal 1
     * static int missingNum(int[] a, int n) {
     * int sum = (n * (n + 1)) / 2;
     * 
     * int sum1 = 0;
     * for (int i = 0; i < n - 1; i++) {
     * sum1 = sum1 + a[i];
     * }
     * if (sum1 != sum) {
     * return sum - sum1;
     * }
     * return -1;
     * }
     */

    // Optimal 2
    static int missingNum(int[] a, int n) {
        int xor1 = 0, xor2 = 0;

        for (int i = 0; i < n - 1; i++) {
            xor2 = xor2 ^ a[i];
            xor1 = xor1 ^ (i + 1);
        }
        xor1 = xor1 ^ n;
        return (xor1 ^ xor2);
    }
}
