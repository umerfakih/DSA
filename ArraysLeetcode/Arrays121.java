package ArraysLeetcode;

/**
 * Arrays121
 */
public class Arrays121 {

    public static void main(String[] args) {
        int[] prices = { 2,4,1 };
        maxProfit(prices);
    }

    static void maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;

        for (int price : prices) {
            minPrice = Math.min(minPrice, price);
            maxProfit = Math.max(maxProfit, price - minPrice);
        }

        System.out.println(maxProfit);
    }

}