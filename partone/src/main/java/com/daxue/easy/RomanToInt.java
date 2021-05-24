package com.daxue.easy;

import java.util.HashMap;

/**
 * @author daxue0929
 * @date 2021/05/25
 **/
public class RomanToInt {
    public static void main(String[] args){
        System.out.println(romanToInt("LVIII"));
    }

    public static int romanToInt(String s) {
        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
        s = s.replace("CM", "Q");//900
        s = s.replace("CD", "W"); //400
        s = s.replace("XC", "E"); //90
        s = s.replace("XL", "R"); //40
        s = s.replace("IX", "T"); //9
        s = s.replace("IV", "Y"); //4

        char[] chars = s.toCharArray();
        int result = 0;
        for (char aChar : chars) {
            switch (aChar) {
                case 'Q':
                    result += 900;
                    break;
                case 'W':
                    result += 400;
                    break;
                case 'E':
                    result += 90;
                    break;
                case 'R':
                    result += 40;
                    break;
                case 'T':
                    result += 9;
                    break;
                case 'Y':
                    result += 4;
                    break;

                case 'I':
                    result += 1;
                    break;
                case 'V':
                    result += 5;
                    break;
                case 'X':
                    result += 10;
                    break;
                case 'L':
                    result += 50;
                    break;
                case 'C':
                    result += 100;
                    break;
                case 'D':
                    result += 500;
                    break;
                case 'M':
                    result += 1000;
                    break;
            }
        }
        return result;
    }
}
