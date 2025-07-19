import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MapExercises {
    /** Returns a map from every lower case letter to the number corresponding to that letter, where 'a' is
     * 1, 'b' is 2, 'c' is 3, ..., 'z' is 26.
     */
    public static Map<Character, Integer> letterToNum() {
        // TODO: Fill in this function.
        TreeMap<Character, Integer> letter_number = new TreeMap<Character, Integer>();
        char c = 'a';
        for (int i = 1; i <= 26; i++) {
            letter_number.put(c, i);
            c += 1;

        }
        return letter_number;
    }

    /** Returns a map from the integers in the list to their squares. For example, if the input list
     *  is [1, 3, 6, 7], the returned map goes from 1 to 1, 3 to 9, 6 to 36, and 7 to 49.
     */
    public static Map<Integer, Integer> squares(List<Integer> nums) {
        // TODO: Fill in this function.
        TreeMap<Integer, Integer> sq_lst = new TreeMap<>();
        for (int elem : nums) {
            sq_lst.put(elem, elem * elem);
        }
        return sq_lst;
    }

    /** Returns a map of the counts of all words that appear in a list of words. */
    public static Map<String, Integer> countWords(List<String> words) {
        // TODO: Fill in this function.
        TreeMap<String, Integer> counts = new TreeMap<>();
        for (String s : words) {
            if (counts.containsKey(s)) {
                counts.put(s, counts.get(s) + 1);
            }
            else     {
                counts.put(s, 1);
            }
        }
        return counts;
    }
}
