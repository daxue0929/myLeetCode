package com.daxue;

import javax.print.attribute.standard.PresentationDirection;
import java.util.ArrayList;

/**
 * @author daxue0929
 * @date 2020/09/15
 * 整数反转这个简单
 **/
public class Reverse {
    public static void main(String[] args){
        int t = 1534236469;

        int reverse = Solution.reverse(t);
        System.out.println(reverse);

    }

    static class Solution {
        public static int reverse(int x) {
            int flag = 0;
            if (x < 0) {
                flag = -1;
                x = 0 - x;
            }
            ArrayList<Integer> result = new ArrayList<>();
            while (true) {
                if (x >= 10) {
                    int temp = x % 10;
                    if (result.size() == 0 && temp == 0) {
                        x = x / 10;
                        continue;
                    }
                    result.add(temp);
                    x = x / 10;

                }else {
                    result.add(x);
                    break;
                }
            }
            long a = 0;
            for (int i = 0; i<result.size(); i++) {
                Integer integer = result.get(i);
                double pow = Math.pow(10, result.size() - i - 1);
                a += integer * pow;
            }
            if (flag < 0) {
                a = 0 - a ;
            }
            if (a >= Math.pow(2, 31) || a < -Math.pow(2, 31)) {
                return 0;
            }else {
                return (int) a;
            }
        }
    }
}
