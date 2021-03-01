package com.daxue;

/**
 * 给定长度分别为 m 和 n 的两个数组，其元素由 0-9 构成，表示两个自然数各位上的数字。现在从这两个数组中选出 k (k <= m + n) 个数字拼接成一个新的数，要求从同一个数组中取出的数字保持其在原数组中的相对顺序。
 * <p>
 * 求满足该条件的最大数。结果返回一个表示该最大数的长度为 k 的数组。
 * <p>
 * 说明: 请尽可能地优化你算法的时间和空间复杂度。
 */
public class MaxNumber {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums1 = new int[10];
        int[] nums2 = new int[10];
        int k = 0;
        solution.maxNumber(nums1, nums2, k);
    }

    static class Solution {
        public int[] maxNumber(int[] nums1, int[] nums2, int k) {
            return new int[1];
        }

        public int[] maxNumber1(int[] nums1, int[] nums2, int k) {
            for (int i = 0; i < k; i++) {
                // k位数字，最大的数，组成一个数组

            }

            return new int[1];
        }

    }

}



