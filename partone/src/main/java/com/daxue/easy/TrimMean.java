package com.daxue.easy;

import java.util.Arrays;

/**
 * @author daxue0929
 * @date 2022/12/29
 */

public class TrimMean {

    public static void main(String[] args) {
        int[] temp = {1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
        double v = TrimMean.trimMean(temp);
        System.out.println(v);

    }

    public static double trimMean(int[] arr) {
        Arrays.sort(arr);
        int len = arr.length, count=0;
        for (int i = len / 20; i < len - len / 20; i++) count += arr[i];
        return count / (len * 0.9);
    }
}
