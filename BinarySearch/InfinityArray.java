package BinarySearch;

/**
 * AmazonQuestion
 */
public class InfinityArray {

    public static void main(String[] args){
        int[] arr = { 2, 5, 7, 10, 22, 40, 78, 90, 112 };
        System.out.println(ans(arr, 10));
    } 

    static int ans(int[] arr,int target){
        int start = 0;
        int end = 1;
        while (target > arr[end]) {
            int newStart = end + 1;
             end = end + (end - start + 1) * 2;
            start = newStart;
        }
        return search(arr,target,start,end);
    }
    static int search(int[] arr,int target,int start,int end){
        while(start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}