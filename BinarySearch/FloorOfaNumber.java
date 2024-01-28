package BinarySearch;

public class FloorOfaNumber {
    public static void main(String[] args) {
        int[] arr = { 2, 5, 7, 10, 22, 40, 78, 90, 112 };
        System.out.println(search(arr, 25));
    }

    static int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return end;
    }
}
