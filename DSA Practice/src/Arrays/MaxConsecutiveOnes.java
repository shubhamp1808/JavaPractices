package Arrays;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] sample = { 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1 };
        int n = sample.length;
        System.out.println("Max Ones in Array is " + (maxConsOnes(sample, n)));
    }

    static int maxConsOnes(int[] a, int n) {
        int max = 0, cnt = 0;

        for (int i = 0; i < n; i++) {
            if (a[i] == 1) {
                cnt++;
                max = Math.max(max, cnt);
            } else {
                cnt = 0;
            }
        }
        return max;
    }
}
