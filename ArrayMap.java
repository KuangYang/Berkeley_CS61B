import java.util.List;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayMap<K, V> implements Iterable<K> {
	private K[] keys;
	private V[] values;
	private int size;

	public ArrayMap() {
		this.keys = (K[]) new Object[100];
		this.values = (V[]) new Object[100];
		this.size = 0;
	}

	private int findKey(K key) {
		for (int i = 0; i < this.size; i++) {
			if (this.keys[i].equals(key)) {
				return i;
			}
		}
		return -1;
	}

	public void put(K key, V value) {
		int i = this.findKey(key);
		if (i > -1) {
			this.values[i] = value;
			return;
		}

		this.keys[size] = key;
		this.values[size] = value;
		this.size += 1;
	}

	public V get(K key) {
		if (this.findKey(key) < 0) {
			throw new IllegalArgumentException(key + "is not a valid key!");
		}
		return this.values[this.findKey(key)];
	}

	public boolean containsKey(K key) {
		int i = this.findKey(key);
		return (i > -1);
	}

	public List<K> keys() {
		if (this.size == 0) {
			return null;
		}
		return Arrays.asList(this.keys).subList(0, this.size);
	}

	public class MapWizard implements Iterator<K> {
		private int notionOfWhereHeIs;

		public MapWizard() {
			this.notionOfWhereHeIs = 0;
		}

		public boolean hasNext() {
			return (notionOfWhereHeIs < size);
		}

		public K next() {
			K currentThing = keys[notionOfWhereHeIs];
			notionOfWhereHeIs += 1;
			return currentThing;
		}
	}

	public Iterator<K> iterator() {
		return new MapWizard();
	}

}
