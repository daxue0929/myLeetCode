package com.daxue;

import org.junit.Test;

import java.util.HashMap;

/**
 * 两数之和
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 *
 * 给定 nums = [2, 7, 11, 15], target = 9
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }


    @Test
    public void test001() {
        Solution solution = new Solution();
        int[] nums = {1,2,3,4,5,6,7,8,9};
        int[] ints = solution.twoSum(nums, 9);
        System.out.println(nums[ints[0]] + " " + nums[ints[1]]);
    }


    class Solution {
        public int[] twoSum(int[] nums, int target) {
            HashMap<Integer,Integer> map = new HashMap<>();
            int[] res = new int[2];
            for (int i = 0; i < nums.length; i++) {
                int dif = target - nums[i];
                if (map.get(dif) != null) {
                    res[0] = map.get(dif);
                    res[1] = i;
                    return res;
                }
                map.put(nums[i],i);
            }
            return res;
        }
    }
}



