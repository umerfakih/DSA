package LinearSearch;

public class FindMinNumber {
    public static void main(String[] args) {
        int[] nums = { 23, 12, 45, 1, 7, 29, 33 };
        System.out.println(search(nums));
    }

    static int search(int[] arr) {
        int ans = arr[0];
        for (int element : arr) {
            if (element < ans) {
                ans = element;
            }
        }
        return ans;
    }
}
