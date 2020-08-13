package com.daxue;

import java.util.ArrayList;

/**
 * 有效的括号
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 *
 * 有效字符串需满足：
 *
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 *
 * 输入: "{[]}"
 * 输出: true
 *
 * 输入: "()"
 * 输出: true
 *
 * 输入: "(]"
 * 输出: false
 */
public class ValidParenthesis {
    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean valid = solution.isValid("[[{()}]]");
        System.out.println("匹配有效的括号:" + valid);

    }

    static class Solution {
        public boolean isValid(String s) {
            char[] charArray = s.toCharArray();
            ArrayList<Character> list = new ArrayList<>();
            for (int i = 0; i <charArray.length; i++) {
                if (list.size()!=0) {
                    char o = list.get(list.size() - 1);
                    switch (o) {
                        case '{' :
                            if (charArray[i] == '}') list.remove(list.size()-1);
                            else list.add(charArray[i]);
                            break;
                        case '[' :
                            if (charArray[i] == ']') list.remove(list.size()-1);
                            else list.add(charArray[i]);
                            break;
                        case '(' :
                            if (charArray[i] == ')') list.remove(list.size()-1);
                            else list.add(charArray[i]);
                            break;
                    }
                }else {
                    list.add(charArray[i]);
                }
            }
            return list.size()==0;
        }
    }

}
