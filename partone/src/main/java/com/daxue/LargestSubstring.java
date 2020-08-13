package com.daxue;

import org.omg.CORBA.INTERNAL;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * @author daxue0929
 * @date 2020/08/13
 **/
public class LargestSubstring {
    public static void main(String[] args){
        String s = "pwwkew";
        Solution solution = new Solution();
        int i = solution.largestSubstringLength(s);
        System.out.println(i);

        int i1 = solution.lengthOfLongestSubstring(s);
        System.out.println(i1);

    }

    static class Solution {
        public int largestSubstringLength(String s) {
            int length = s.length();
            int result = 0;
            HashMap<Character, Integer> map = new HashMap<>();
            for (int i=0, j=0; j<length; j++) {
                if (!map.containsKey(s.charAt(j))) {
                    map.put(s.charAt(j), j);
                    result = Math.max(result, j +1 - i);
                }else {
                    i++;
                }
            }
            return result;
        }

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
