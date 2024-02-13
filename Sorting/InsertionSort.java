package Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] nums = { 5, 2, 3, 9, 1 };
        sort(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void sort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (nums[j] < nums[j - 1]) {
                    swap(nums, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }

    static void swap(int[] nums, int maxIndex, int last) {
        int temp = nums[maxIndex];
        nums[maxIndex] = nums[last];
        nums[last] = temp;
    }
}
