import java.util.List;

public class MapHelper {

    public static <K, V> V get(ArrayMap<K, V> am, K key) {
        if (am.containsKey(key)) {
            return am.get(key);
        }
        return null;
    }

    public static <K extends Comparable<K>, V> K maxKey(ArrayMap<K, V> am) {
        List<K> keys = am.keys();
        K maxKey = keys.get(0);
        for (int i = 0; i < keys.size() ; i++) {
            int cmp;
            cmp = keys.get(i).compareTo(maxKey);
            if (cmp > 0) {
                maxKey = keys.get(i);
            }
        }
        return maxKey;
    }

    public static void main(String[] args) {
        ArrayMap<Integer, String> ismap = new ArrayMap<Integer, String>();
        ismap.put(5, "hello");
        ismap.put(10, "ketchup");
        ismap.put(72, "Yang");
        System.out.println(MapHelper.get(ismap, 10));
        System.out.println(MapHelper.maxKey(ismap));
    }
}
