package com.daxue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ArrayUniq {
    public static void main(String[] args) {
        Solution solution = new ArrayUniq.Solution();
        int[] origin ={0,0,1,1,1,2,2,3,3,4}; // 示例数据
        int length = solution.removeDuplicates(origin);
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i< length; i++) {
            buffer.append(origin[i]);
            if (i != length-1) {
                buffer.append(",");
            }
        }
        System.out.println(buffer.toString());
    }


    public static class Solution{
        public int removeDuplicates(int[] nums) {
            ArrayList<Integer> list = new ArrayList<>();
            HashSet<Object> set = new HashSet<>();
            for (int number: nums) {
                if (set.contains(number)) continue;
                set.add(number);
                list.add(number);
            }
            Collections.sort(list, new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o1 - o2;
                }
            });
            for (int i = 0; i < list.size(); i++) {
                nums[i] = list.get(i);
            }
            return list.size();
        }
    }
}

