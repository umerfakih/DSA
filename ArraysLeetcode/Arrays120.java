package ArraysLeetcode;

import java.util.ArrayList;
import java.util.List;

public class Arrays120 {
    public static void main(String[] args) {
        List<List<Integer>> triangle = new ArrayList<>();
        List<Integer> innerList1 = new ArrayList<>();
        innerList1.add(-1);
        triangle.add(innerList1);
        
        List<Integer> innerList2 = new ArrayList<>();
        innerList2.add(2);
        innerList2.add(3);
        triangle.add(innerList2);
        
        List<Integer> innerList3 = new ArrayList<>();
        innerList3.add(1);
        innerList3.add(-1);
        innerList3.add(-3);
        triangle.add(innerList3);

        System.out.println(minimumTotal(triangle));
    }

    static int minimumTotal(List<List<Integer>> triangle) {
        if (triangle.size() == 0)
            return 0;

        // Initialize the sum with the top element of the triangle
        int sum = triangle.get(0).get(0);

        // Iterate through each row of the triangle starting from the second row
        for (int i = 1; i < triangle.size(); i++) {
            List<Integer> row = triangle.get(i);

            // Update the sum by adding the minimum value from the previous row to each element of the current row
            sum += getMin(row);
        }

        return sum;
    }

    // Helper method to find the minimum value in a list
    static int getMin(List<Integer> list) {
        int min = Integer.MAX_VALUE;
        for (int num : list) {
            min = Math.min(min, num);
        }
        return min;
    }
}
