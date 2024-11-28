package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Subsequence {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        int[] nums = {1,2,1};
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        int ind = 0;
        int k = 4;
        int sum = 0;
        // System.out.println(findSubsets(ind, list, res, nums));
        // System.out.println(sumOfSubsetsEqualsK(ind, list, res, nums, k, sum));
        // oneSubsetsEqualsK(ind, list, res, nums, k, sum);
        System.out.println(countSubsetsEqualsK(ind, nums, k, sum));
    }
    
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public static List<List<Integer>> findSubsets(int ind, List<Integer> list, List<List<Integer>> res, int[] nums){
        if(ind == nums.length){
            res.add(new ArrayList(list));
            return res;
        }
        list.add(nums[ind]);
        findSubsets(ind+1, list, res, nums);
        list.remove(list.size()-1);
        findSubsets(ind+1, list, res, nums);
        return res;
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    public static List<List<Integer>> sumOfSubsetsEqualsK(int ind, List<Integer> list, List<List<Integer>> res, int[] nums, int k, int sum){
        if(ind >= nums.length){
            if(sum==k){
            res.add(new ArrayList(list));
            }
            return res;
        }
        list.add(nums[ind]);
        sum += nums[ind];
        sumOfSubsetsEqualsK(ind+1, list, res, nums, k, sum);
        list.remove(list.size()-1);
        sum -= nums[ind];
        sumOfSubsetsEqualsK(ind+1, list, res, nums, k, sum);

        return res;
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    // static boolean flag = false;
    public static boolean oneSubsetsEqualsK(int ind, List<Integer> list, List<List<Integer>> res, int[] nums, int k, int sum){
        if(ind == nums.length){
            if(sum==k){
            // flag = true;
            res.add(new ArrayList(list));
            System.out.println(res);
            return true;
            }
            return false;
        }
        list.add(nums[ind]);
        sum += nums[ind];
        if(oneSubsetsEqualsK(ind+1, list, res, nums, k, sum)==true) return true;
        list.remove(list.size()-1);
        sum -= nums[ind];
        if(oneSubsetsEqualsK(ind+1, list, res, nums, k, sum)==true) return true;

        return false;
    }

    public static int countSubsetsEqualsK(int ind, int[] nums, int k, int sum){
        if(ind == nums.length){
            if(sum==k){
            return 1;
            }
            return 0;
        }
        sum += nums[ind];
        int l = countSubsetsEqualsK(ind+1, nums, k, sum);
        sum -= nums[ind];
        int r = countSubsetsEqualsK(ind+1, nums, k, sum);

        return l+r;
    }
}
