import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class ListExercises {

    /** Returns the total sum in a list of integers */
    public static int sum(List<Integer> L) {
        // TODO: Fill in this function.
        int total = 0;
        for (int elem: L) {
            total += elem;
        }
        return total;
    }

    /** Returns a list containing the even numbers of the given list */
    public static List<Integer> evens(List<Integer> L) {
        // TODO: Fill in this function.
        List<Integer>   even = new ArrayList<>();
        for (int elem: L)
        {
            if (elem % 2 == 0) {
                even.add(elem);
            }
        }
        return even;
    }

    /** Returns a list containing the common item of the two given lists */
    public static List<Integer> common(List<Integer> L1, List<Integer> L2) {
        // TODO: Fill in this function.
        List<Integer> common = new ArrayList<>();
        for (int elem: L1)
            if (L2.contains(elem)) {
                common.add(elem);
            }
        return common;
    }


    /** Returns the number of occurrences of the given character in a list of strings. */
    public static int countOccurrencesOfC(List<String> words, char c) {
        // TODO: Fill in this function.
        int count = 0;
        int ind = 0;

        for (String s: words) {
            while (s.indexOf(c) != -1) {
                ind = s.indexOf(c);
                s = s.substring(ind + 1);
                count += 1;

            }

        }
        return count;
    }
}
