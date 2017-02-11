import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;

public class FindFirstUniqueChar {
    public static char find(String str) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (char c : str.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        for (int i = 0; i < str.length(); i++) {
            if (map.get(str.charAt(i)) == 1) {
                return str.charAt(i);
            }
        }
        return 0; // 0 represents the NULL character
    }

    public static char find_in_one_loop(String str) {
        Set<Character> repeats = new HashSet<Character>();
        List<Character> uniques = new ArrayList<Character>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (repeats.contains(c)) {
                continue;
            }
            if (uniques.contains(c)) {
                /* Attention: Java has 2 overloaded remove methods: remove(int
                 * index) and remove(Object object). So here we need to specify it.
                 */
                uniques.remove((Character) c);
                repeats.add(c);
            } else {
                uniques.add(c);
            }
        }
        return uniques.get(0);
    }

    public static void main(String[] args) {
        String test = "kuangyang";
        System.out.println(find(test));
        System.out.println(find_in_one_loop(test));
    }
}
