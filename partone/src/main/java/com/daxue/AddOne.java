package com.daxue;

import sun.java2d.windows.GDIWindowSurfaceData;

import java.util.ArrayList;
import java.util.Arrays;

public class AddOne {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] origin ={0,0,1,1,1,2,2,3,3,4}; // 示例数据
        int[] result = solution.plusOne(origin);
        System.out.println(result);
    }

    /**
     * 对于长的数组, 运算有越界的的异常错误
     * 应该使用超大数位 数字四则运算的方式,来计算本题
     * version: 1.0
     */
    static class Solution {
        public int[] plusOne(int[] digits) {
            ArrayList<Integer> list = new ArrayList<>();
            String str = "";
            for (int i=0; i<digits.length; i++) {
                list.add(digits[i]);
                str += digits[i];
            }
            int resultNUmber = Integer.parseInt(str) + 1;

            int [] result = new int[String.valueOf(resultNUmber).length()];
            for (int i = String.valueOf(resultNUmber).length()-1; i >=0; i--) {
                result[i] = resultNUmber % 10;
                resultNUmber = resultNUmber / 10;
            }
            return result;
        }
    }
}
