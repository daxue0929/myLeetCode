package com.daxue;

import org.omg.CORBA.INTERNAL;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * 滑动窗口算法
 * @author daxue0929
 * @date 2020/08/13
 **/
public class LargestSubstring {
    public static void main(String[] args){
        String s = "pwwkew";
        Solution solution = new Solution();
        int i = solution.differentCharacterLength(s);
        System.out.println(i);

        int i1 = solution.lengthOfLongestSubstring(s);
        System.out.println(i1);

    }

    /**
     * 错误示例
     */
    static class Solution {
        public int differentCharacterLength(String s) {
            int length = s.length();
            int result = 0;
            HashMap<Character, Integer> map = new HashMap<>();
            for (int i=0, j=0; j<length; j++) {
                if (!map.containsKey(s.charAt(j))) {
                    map.put(s.charAt(j), j);
                    result = Math.max(result, j + 1 - i);
                }else {
                    i++;
                }
            }
            return result;
        }

        /**
         * 集合set作为滑动窗口，记录当前满足条件的最长元素集合
         * 初始化ij相等，都等于0。循环数组，如果j对应元素不存在set中，继续右移动，扩大窗口范围。记录当前size，并进行比较，记录最大size
         * 如果j的元素一旦在set中存在，移除set中的第一个元素，也就是移动左侧指针i，缩小窗口范围
         * 直到i 和j其中一个大于数组长度终止循环
         * @param s
         * @return
         */
        public int lengthOfLongestSubstring(String s) {
            int n = s.length();
            Set<Character> set = new HashSet<>();
            int ans = 0, i = 0, j = 0;
            while (i < n && j < n) {
                // try to extend the range [i, j]
                if (!set.contains(s.charAt(j))) {
                    set.add(s.charAt(j++));
                    ans = Math.max(ans, j - i);
                } else {
                    set.remove(s.charAt(i++));
                }
            }
            return ans;
        }
    }
}
