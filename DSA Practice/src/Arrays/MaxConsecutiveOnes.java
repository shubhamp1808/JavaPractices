package Arrays;

// Maximum Consecutive One's in an Array

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] sample = { 1, 1, 0, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1 };
        int n = sample.length;
        System.out.println("Max Ones in Array is " + (maxConsOnes(sample, n)));
    }

    static int maxConsOnes(int[] nums, int n) {
        // max consecutive Ones
        // /*
        int max = 0, cnt = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] == 1) {
                cnt++;
                max = Math.max(max, cnt);
            } else {
                cnt = 0;
            }
        }
        return max;
        // */

        // max consecutive Ones or Zeros
        /*
        int count_1 = 0;
        int count_0 = 0;
        int max_count_1 = 0;
        int max_count_0 = 0;
        for(int i=0; i<n; i++){
            if(nums[i]==1){
                count_1++;
                max_count_1 = Math.max(count_1, max_count_1);
            }
            if(nums[i]==0){
                count_0++;
                max_count_0 = Math.max(count_0, max_count_0);
            }
            if(nums[i]!=0) {
                count_0 = 0;
            }
            if(nums[i]!=1){
                count_1 = 0;
            }
        }
        System.out.println(max_count_0 + "::" + max_count_1);
        return max_count_0>max_count_1 ? max_count_0 : max_count_1;
        */
    }
}
