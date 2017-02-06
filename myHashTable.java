import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Iterator;

public class myHashTable<K, V> {
    private ArrayList<LinkedList<Entry<K, V>>> arrayList;
    private int size;

    private class Entry<K, V> {
        private K key;
        private V value;
        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    public myHashTable(int size) {
        this.size = size;
        this.arrayList = new ArrayList<>(size);
        for (int i = 0; i < this.size; i++) {
            arrayList.add(i, null);
        }
    }

    public synchronized void put(K key, V value) {
        if (key == null) {
            throw new NullPointerException("key is null!");
        }
        int key_index = key.hashCode() % this.size;
        if (arrayList.get(key_index) == null) {
            arrayList.set(key_index, new LinkedList<Entry<K, V>>());
            arrayList.get(key_index).add(new Entry<K, V>(key, value));
            return;
        }
        LinkedList<Entry<K, V>> linkedList = arrayList.get(key_index);
        Iterator<Entry<K, V>> iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            Entry<K, V> entry = iterator.next();
            if (entry.key.equals(key)) {
                entry.value = value;
                return ;
            }
        }
        linkedList.add(new Entry<K, V>(key, value));
    }

    public V get(K key) {
        if (key == null) {
            throw new NullPointerException("key is null!");
        }
        int key_index = key.hashCode() % this.size;
        if (arrayList.get(key_index) == null) {
            return null;
        }
        LinkedList<Entry<K, V>> linkedList = arrayList.get(key_index);
        Iterator<Entry<K, V>> iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            Entry<K, V> entry = iterator.next();
            if (entry.key.equals(key)) {
                return entry.value;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        myHashTable<String, String> mht = new myHashTable<String, String>(1024);
        mht.put("yang", "kuang");
        mht.put("Usa", "Columbia");
        System.out.println(mht.get("Usa"));
        System.out.println(mht.get("yang"));
        System.out.println(mht.get("test"));
    }
}
