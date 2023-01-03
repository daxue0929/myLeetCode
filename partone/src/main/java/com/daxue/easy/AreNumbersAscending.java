package com.daxue.easy;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * 检查句子中的数字是否递增
 *
 * 句子是由若干 token 组成的一个列表，token 间用 单个 空格分隔，句子没有前导或尾随空格。每个 token 要么是一个由数字 0-9 组成的不含前导零的 正整数 ，要么是一个由小写英文字母组成的 单词 。
 *
 * 示例，"a puppy has 2 eyes 4 legs" 是一个由 7 个 token 组成的句子："2" 和 "4" 是数字，其他像 "puppy" 这样的 tokens 属于单词。
 * 给你一个表示句子的字符串 s ，你需要检查 s 中的 全部 数字是否从左到右严格递增（即，除了最后一个数字，s 中的 每个 数字都严格小于它 右侧 的数字）。
 *
 * 如果满足题目要求，返回 true, 否则，返回 false 。
 *
 * @author daxue0929
 * @date 2023/1/3
 */

public class AreNumbersAscending {
    public static void main(String[] args) {
//        String s = "1 box has 3 blue 4 red 6 green and 12 yellow marbles";
        String s = "hello world 5 x 5";
        boolean b = AreNumbersAscending.areNumbersAscending(s);
        System.out.println(b);
    }

    public static boolean areNumbersAscending(String s) {
        int[] array = Arrays.stream(s.split(" ")).filter(item -> {
            try {
                Integer.parseInt(item);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
        }).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] >= array[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
