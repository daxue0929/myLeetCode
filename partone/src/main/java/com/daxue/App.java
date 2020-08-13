package com.daxue;

import org.junit.Test;

import java.util.HashMap;

/**
 * Hello world!
 *
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



