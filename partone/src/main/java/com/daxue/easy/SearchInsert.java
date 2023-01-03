package com.daxue.easy;

/**
 * @author daxue0929
 * @date 2023/1/3
 */

public class SearchInsert {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        System.out.println(SearchInsert.searchInsert(nums, 3));
    }


    public static int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + ((right - left) / 2);
            if (target > nums[mid]) {
                left = mid+1;
            } else if (target < nums[mid]) {
                right = mid-1;
            } else {
                return mid;
            }
        }
        return left;
    }
}
