package LinearSearch;

public class LeetCode1295 {
    public static void main(String[] args) {
        int[] nums = { 555, 901, 482, 1771 };

        System.out.println(FindEvenNumbers(nums));
    }

    static int FindEvenNumbers(int[] nums) {
        int count = 0;

        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    static boolean even(int num) {
        int numOfDigits = digits(num);
        return numOfDigits % 2 == 0;
    }

    static int digits(int num) {
        return (int) (Math.log10(num)) + 1;
    }
}
