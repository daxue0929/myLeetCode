package com.daxue.easy;

/**
 * @author daxue0929
 * @date 2021/05/25
 **/
public class IsPalindrome {

    public static void main(String[] args){
        int num = 12321321;
        System.out.println(isPalindrome(num));
    }

    public static boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        char[] chars = s.toCharArray();
        for (int i =0; i<chars.length/2; i++) {
            if (chars[i] != chars[chars.length - i - 1]) {
                return false;
            }
        }
        return true;
    }
}
