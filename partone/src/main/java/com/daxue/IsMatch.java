package com.daxue;

/**
 * 给你一个字符串 s 和一个字符规律 p，请你来实现一个支持 '.' 和 '*' 的正则表达式匹配。
 *
 * '.' 匹配任意单个字符
 * '*' 匹配零个或多个前面的那一个元素
 * 所谓匹配，是要涵盖 整个 字符串 s的，而不是部分字符串。
 */
public class IsMatch {
    public static void main(String[] args) {
        boolean match = new Solution().isMatch("aa", "a");
        System.out.println(match);

    }

    public static class Solution {
        public boolean isMatch(String s, String p) {
            boolean m = p.indexOf("*") == -1;
            boolean n = p.indexOf(".") == -1;
            if (m && n) return s.equals(p); // p中没有* 没有 .

            char[] ori = s.toCharArray();
            char[] res = p.toCharArray();




            return Boolean.TRUE;
        }
    }
}
