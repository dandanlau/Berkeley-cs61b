import java.util.ArrayList;
import java.util.List;

public class JavaExercises {

    /**
     * Returns an array [1, 2, 3, 4, 5, 6]
     */
    public static int[] makeDice() {
        // TODO: Fill in this function.
        int[] a = {1, 2, 3, 4, 5, 6};
        return a;
    }

    /**
     * Returns the order depending on the customer.
     * If the customer is Ergun, return ["beyti", "pizza", "hamburger", "tea"].
     * If the customer is Erik, return ["sushi", "pasta", "avocado", "coffee"].
     * In any other case, return an empty String[] of size 3.
     */
    public static String[] takeOrder(String customer) {
        // TODO: Fill in this function.
        String[] order = new String[4];
        String[] empty_order = new String[3];
        //String [] order;
        if (customer.equals("Ergun")) {
            order[0] = "beyti";
            order[1] = "pizza";
            order[2] = "hamburger";
            order[3] = "tea";
        } else if (customer.equals("Erik")) {
            order[0] = "sushi";
            order[1] = "pasta";
            order[2] = "avocado";
            order[3] = "coffee";
        } else {
            order = empty_order;
        }
        return order;
    }

    /**
     * Returns the positive difference between the maximum element and minimum element of the given array.
     * Assumes array is nonempty.
     */
    public static int findMinMax(int[] array) {
        // TODO: Fill in this function.
        int min = array[0];
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            min = (array[i] < min) ? array[i] : min;
            max = (array[i] > max) ? array[i] : max;
        }

        return (max - min);
    }

    /**
     * Uses recursion to compute the hailstone sequence as a list of integers starting from an input number n.
     * Hailstone sequence is described as:
     * - Pick a positive integer n as the start
     * - If n is even, divide n by 2
     * - If n is odd, multiply n by 3 and add 1
     * - Continue this process until n is 1
     */
    public static List<Integer> hailstone(int n) {
        ArrayList<Integer> seq = new ArrayList<Integer>();
        return hailstoneHelper(n, seq);
    }

    private static List<Integer> hailstoneHelper(int x, List<Integer> list) {
        // TODO: Fill in this function.
        list.add(x);
        if (x == 1) {

        }
        else if (x % 2 == 0) {
            x = x / 2;
            hailstoneHelper(x, list);

        } else if (x % 2 == 1) {
            x = x * 3 + 1;
            hailstoneHelper(x, list);

        }
            return list;

    }
}


