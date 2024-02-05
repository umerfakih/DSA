package BinarySearch;

/**
 * leetcode1905Hard
 */
public class leetcode1905Hard {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1};
        int target = 3;
        System.out.println(search(arr, target));
    }

    static int search(int[] arr ,int target){
        int peak = peakIndexMountainArray(arr);
        int firstTry = BinarySearch(arr,target,0,peak);
        if(firstTry != -1){
            return firstTry;
        }
        int secondTry = OrderAgnosticBS(arr,target,peak + 1,arr.length -1);
        return secondTry;
    }

    static int peakIndexMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return end;
    }

    static int BinarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    static int OrderAgnosticBS(int[] arr, int target,int start,int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }
                else if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        return -1;

    }
}