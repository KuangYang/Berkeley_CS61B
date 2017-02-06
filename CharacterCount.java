import java.util.Map;
import java.util.HashMap;

public class CharacterCount {
    public static void main(String[] args) {
        In in = new In("CharacterCount.java");
        Map<Character, Integer> charCounts = new HashMap<Character, Integer>();

        while (!in.isEmpty()) {
            char current = in.readChar();

            if(!charCounts.containsKey(current)) {
                charCounts.put(current, 1);
            } else {
                int oldCount = charCounts.get(current);
                charCounts.put(current, oldCount + 1);
            }
        }
        System.out.println(charCounts);
    }
}
