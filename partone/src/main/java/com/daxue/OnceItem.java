package com.daxue;

public class OnceItem {
    public static void main(String[] args) {
        int[] array ={2,2,3,8,3};
        Solution solution = new Solution();
        int number = solution.singleNumber(array);
        System.out.println(number);


    }


    static class Solution {
        public int singleNumber(int[] nums) {
            for (int i=0; i<nums.length; i++) {
                boolean flag = false;
                for (int j = 0; j< nums.length; j++) {
                    if (i==j) continue;
                    if (nums[i] == nums[j]) {
                        flag = true;
                        break;
                    }
                }
                if (!flag) {
                    int temp = 0;
                    temp = nums[0];
                    nums[0] = nums[i];
                    nums[i] = temp;
                    break;
                }
            }
            return nums[0];
        }
    }
}
