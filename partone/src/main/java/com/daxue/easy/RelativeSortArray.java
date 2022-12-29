package com.daxue.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author daxue0929
 * @date 2022/12/29
 * 给你两个数组，arr1 和 arr2，arr2 中的元素各不相同，arr2 中的每个元素都出现在 arr1 中。
 *
 * 对 arr1 中的元素进行排序，使 arr1 中项的相对顺序和 arr2 中的相对顺序相同。
 * 未在 arr2 中出现过的元素需要按照升序放在 arr1 的末尾。
 *
 * 输入：arr1 = [2,3,1,3,2,4,6,7,9,2,19], arr2 = [2,1,4,3,9,6]
 * 输出：[2,2,2,1,4,3,3,9,6,7,19]
 */

public class RelativeSortArray {

    public static void main(String[] args) {

//        int[] arr1 = {2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19}, arr2 = {2, 1, 4, 3, 9, 6};
        int[] arr1 = {1, 2, 3, 4, 5, 0}, arr2 = {4, 1, 3};

        int[] ints = RelativeSortArray.relativeSortArray(arr1, arr2);
        System.out.println(ints);
    }

    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i=0; i< arr2.length; i++) {
            int temp = arr2[i];
            for (int j = 0; j < arr1.length; j++) {
                if (arr1[j] == temp){
                    result.add(arr1[j]);
                    arr1[j] = -arr1[j];
                }
            }
        }
        List<Integer> collect = Arrays
            .stream(arr1)
            .filter(item -> {
                if (item == 0) {
                    return !result.contains(item);
                }
                return item > 0;
            })
            .boxed()
            .sorted()
            .collect(Collectors.toList());
        result.addAll(collect);
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
