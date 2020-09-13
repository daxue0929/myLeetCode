package com.daxue;

import org.junit.Test;

import java.awt.*;

/**
 * @author daxue0929
 * @date 2020/09/13
 **/
public class RemoveElement {
    public static void main(String[] args){
        int[] array = {1,5,8,7,4,6,4};

        int i = Solution.removeElement(array, 7);
        System.out.println(i);
    }

    static class Solution {
        public static int removeElement(int[] nums, int val) {
            int j = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != val) {
                    nums[j] = nums[i];
                    j++;
                }
            }
            return j;
        }
    }

}
