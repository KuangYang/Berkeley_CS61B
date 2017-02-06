public class AList<Item> implements List61B<Item> {
    private Item[] items;
    private int size;
    private static int REFACTOR = 10;

    public AList() {
        this.size = 0;
        this.items = (Item[]) new Object[100];
    }

    private void resize(int capacity) {
        Item[] a = (Item[]) new Object[capacity];
        System.arraycopy(this.items, 0, a, 0, this.size);
        this.items = a;
    }

    private void resizeFront(int capacity) {
        Item[] a = (Item[]) new Object[capacity];
        System.arraycopy(this.items, 0, a, 1, this.size);
        this.items = a;
    }

    public void insertFront(Item x) {
        if (this.size == this.items.length) {
            this.resizeFront(this.size * REFACTOR);
        }
        items[0] = x;
        size += 1;
    }

    public void insertBack(Item x) {
        if (this.size ==  this.items.length) {
            /* Resize the array but inefficient*/
            //this.resize(this.size + 1);
            /* Efficient in Time: This is how the Python list is implemented */
            this.resize(this.size * REFACTOR);
        }
        items[size] = x;
        size += 1;
    }

    public Item getFront() {
        return this.items[0];
    }

    public Item getBack() {
        int lastActualItenIndex = size - 1;
        return this.items[lastActualItenIndex];
    }

    public Item get(int i) {
        return this.items[i];
    }

    public int size() {
        return this.size;
    }

    public Item deleteBack() {
        Item itemToReturn = getBack();
        /* Null out Deleted and unneeded Items. Save memory. Don't loiter. */
        items[size - 1] = null;
        size -= 1;
        return itemToReturn;
    }

    public void insert(Item x, int position) {
        if (position > this.size || position < 0) {
            return;
        }

        if (position == 0) {
            this.insertFront(x);
        } else if (position == this.size) {
            this.insertBack(x);
        }

        System.out.println("AList Insert!");


    }

    public static int sumWhile(int[] a) {
        int i = 0;
        int sum = 0;

        while (i < a.length) {
            sum += a[i];
            i++; //iteration
        }

        return sum;
    }

    public static int sumFor(int[] a) {
        int sum = 0;

        for (int i = 0; i < a.length; i++) { //iteration
            sum += a[i];
        }

        return sum;
    }

    public static int sumAlt(int[] a) {
        int sum = 0;

        for (int x : a) {
            sum += x;
        }

        return sum;
    }

    public static int sumRecursion(int[] a) {
        return sumRecursion(a, 0);
    }

    public static int sumRecursion(int[] a, int k) {
        if (k == a.length) {
            return 0;
        }

        return a[k] + sumRecursion(a, k + 1);
    }

    /* Not do this unless required */
    public static int sumBasic(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; sum += a[i], i++);
        return sum;
    }

}
