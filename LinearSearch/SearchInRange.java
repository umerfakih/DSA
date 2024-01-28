package LinearSearch;

/**
 * linearSearch
 */
public class SearchInRange {

    public static void main(String[] args) {

        int[] nums = { 23, 12, 45, 1, 7, 29, 33 };
        int target = 7;
        // thala for a reason

        boolean ans = search(nums, target,1,4);
        System.out.println(ans);

    }

    static boolean search(int[] arr, int target,int start , int end) {
        if (arr.length == 0) {
            return false;
        }
        for(int i = start ; i <= end ; i++){
            int element = arr[i];
            if(element == target){
                return true;
            }
        }
        return false;
    }
}