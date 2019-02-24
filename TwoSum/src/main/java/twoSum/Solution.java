package main.java.twoSum;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int index1 = 0;
        while (index1 < nums.length) {
            int index2 = index1 + 1;
            while (index2 < nums.length) {
                if (nums[index1] + nums[index2] == target) {
                    int[] ret = {index1, index2};
                    // early return. doing a break here won't break out of outer loop
                    return ret;
                }
                index2++;
            }
            index1++;
        }
        return null;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {3, 2, 4};
        int[] sol = solution.twoSum(arr, 6);
        for (int i = 0;  i < sol.length; i++) {
            System.out.println(sol[i]);
        }
    }
}
