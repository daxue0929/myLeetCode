package com.daxue;

/**
 *
 * 给定一个整数数组 A，如果它是有效的山脉数组就返回 true，否则返回 false。
 *
 * 让我们回顾一下，如果 A 满足下述条件，那么它是一个山脉数组：
 *
 * A.length >= 3
 * 在 0 < i < A.length - 1 条件下，存在 i 使得：
 * A[0] < A[1] < ... A[i-1] < A[i]
 * A[i] > A[i+1] > ... > A[A.length - 1]
 *
 */
public class ValidMountainArray {
    public static void main(String[] args) {
        int test[] = {1,2,4,5,4,3,1};
        Solution solution = new Solution();
        boolean b = solution.validMountainArray(test);
        System.out.println(b);

    }

    /**
     * 1：对于一个(高内聚的模块)而言，凡事传入的数组，都是不可信的，效验是否为空；
     * 2：先处理极限的情况，比如本题中的，都是下山或者都是上山情况
     *
     *
     */
    public static class Solution {
        public boolean validMountainArray(int[] A) {
            if (A == null || A.length <= 2) return Boolean.FALSE;
            int i = 0;
            while (i<A.length-1 && A[i]<=A[i+1]) {
                i++;
            }
            if(i == 0 || i == A.length-1) return Boolean.FALSE;

            for (int j = i; j < A.length-1;  j++) {
                if (A[j]-A[j+1] < 0){
                    return Boolean.FALSE;
                }
            }
            return Boolean.TRUE;
        }
    }
}
