package com.daxue.easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author daxue0929
 * @date 2022/12/29
 *
 * 给你三个整数数组 nums1、nums2 和 nums3 ，
 * 请你构造并返回一个 元素各不相同的 数组，且由 至少 在 两个 数组中出现的所有值组成。
 * 数组中的元素可以按 任意 顺序排列。
 *
 * 输入：nums1 = [1,1,3,2], nums2 = [2,3], nums3 = [3]
 * 输出：[3,2]
 * 解释：至少在两个数组中出现的所有值为：
 * - 3 ，在全部三个数组中都出现过。
 * - 2 ，在数组 nums1 和 nums2 中出现过
 */

public class TwoOutOfThree {

    public static void main(String[] args) {
        int[] nums1 = {1,1,3,2}, nums2 = {2,3}, nums3 = {3};
        List<Integer> integers = TwoOutOfThree.twoOutOfThree(nums1, nums2, nums3);
        System.out.println(integers);
    }

    public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        HashSet<Integer> set = new HashSet<>();
        Integer temp1, temp2, temp3;
        for (int i=0; i<nums1.length; i++) {
            temp1 = nums1[i];
            for (int j=0; j<nums2.length; j++) {
                temp2 = nums2[j];
                for (int k = 0; k < nums3.length; k++) {
                    temp3 = nums3[k];
                    if (temp3 == temp2) set.add(temp3);
                    if (temp3==temp1) set.add(temp3);
                }
                if (temp2==temp1) set.add(temp2);
            }
        }
        return new ArrayList<>(set);
    }
}
