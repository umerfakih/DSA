package BinarySearch;

public class LeetCode81 {
    public static void main(String[] args) {
        int[] nums = { 0, 1, 2, 4, 4, 4, 5, 6, 6, 7 };
        System.out.println(search(nums, 4));
    }

    public static boolean search(int[] nums, int target) {
        int pivot = findPivot(nums);
        if (pivot == -1) {
            return BinarySearch(nums, target, 0, nums.length - 1);
        }
        if (nums[pivot] == target) {
            return true;
        }
        if (target >= nums[0]) {
            return BinarySearch(nums, target, 0, pivot);
        }
        return BinarySearch(nums, target, pivot + 1, nums.length - 1);
    }

    static int findPivot(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        if(start == end){
            return -1;
        }
        if (nums[start] < nums[end]) {
            return -1;
        }
        while (start < end) {
            int mid = start + (end - start) / 2;

            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }

            // Handle duplicates
            if (nums[start] == nums[mid] && nums[mid] == nums[end]) {
                if (nums[start] > nums[start + 1]) {
                    return start;
                }
                start++;
                if (nums[end] < nums[end - 1]) {
                    return end - 1;
                }
                end--;
            } else if (nums[start] <= nums[mid]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }

    static boolean BinarySearch(int[] nums, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
