package BinarySearch;

/**
 * Example
 */
public class Example {
    public static void main(String[] args) {

        int[] arr = {2,5,7,10,22,40,78,90,112};
        System.out.println(search(arr, 40));
    }

    static int search(int[] arr,int target){
       int start = 0;
       int end = arr.length  - 1;
       while (start <= end) {
        int mid = start + (end - start) / 2;
        
        if(target < arr[mid]){
            end = mid - 1;
        }
        else if(target > arr[mid]){
            start = mid + 1;
        }
        else{
            return mid;
        }
       }
       return -1;
    }
}