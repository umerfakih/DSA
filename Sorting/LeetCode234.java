package Sorting;

import java.util.Arrays;

public class LeetCode234 {
    public static void main(String[] args) {
        int[] nums = {3,0,1};
        sort(nums);
        System.out.println(Arrays.toString(nums));
    }

    static int sort(int[] nums){
        int i = 0;
        int n = nums.length;
        while (i < nums.length) {
            int correctIndex = nums[i];
            if(nums[i] == n){
                i++;
                continue;
            }
            if(nums[i] != nums[correctIndex]){
                swap(nums, i, correctIndex);
            }
            else{
                i ++;
            }
        }

        for(int index = 0; index < nums.length; index++){
            if(nums[index] != index){
                return index;
            }
        }
        return n;
    }

    static void swap(int[] nums ,int first,int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
