package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = { 5, 2, 3, 9, 1 };
        sort(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void sort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int last = nums.length - i - 1;
            int maxIndex = MaxIndex(nums, 0, last);
            swap(nums, maxIndex, last);
        }

    }

    static int MaxIndex(int[] nums, int start, int end) {
        int max = start;
        for (int i = 0; i <= end; i++) {
            if (nums[i] > nums[max]) {
                max = i;
            }
        }
        return max;
    }

    static void swap(int[] nums, int maxIndex, int last) {
        int temp = nums[maxIndex];
        nums[maxIndex] = nums[last];
        nums[last] = temp;
    }
}
