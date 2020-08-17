package com.daxue;

import com.sun.org.apache.xalan.internal.xsltc.trax.XSLTCSource;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class MoveZeroes {


    public static void main(String[] args) {

        int[] array = {0, 1, 0, 3, 12};

        Solution solution = new Solution();
        solution.moveZeroes(array);

    }

    static class Solution {
        public void moveZeroes(int[] nums) {
            int index = 0;
            for (int i = 0; i< nums.length; i++) {
                if (nums[i] != 0) {
                    nums[index++] = nums[i];
                }
            }
            while (index<nums.length) {
                nums[index++] = 0;
            }
            System.out.println(nums);
        }
    }
}
