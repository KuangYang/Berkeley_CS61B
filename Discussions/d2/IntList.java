public class IntList {
    public int head;
    public IntList tail;

    public IntList(int h, IntList t) {
        this.head = h;
        this.tail = t;
    }

    public int sizeRecursion() {
        if (this.tail == null) {
            return 1;
        }

        return 1 + this.tail.sizeRecursion();
    }

    public int sizeInterative() {
        IntList p = this;
        int size = 0;

        while (p != null) {
            size += 1;
            p = p.tail;
        }

        return size;
    }

    public int getRecursion(int i) {
        if (i == 0) {
            return this.head;
        }

        return this.tail.getRecursion(i-1);
    }

    public int getInterative(int i) {
        IntList p = this;

        while (i != 0) {
            p = p.tail;
            i -= 1;
        }

        return p.head;
    }

    public static void main(String[] args) {
        IntList L = new IntList(5, null);
        L = new IntList(10, L);
        L = new IntList(15, L);

        System.out.println(L.head);
        System.out.println(L.tail.head);
        System.out.println(L.tail.tail.head);
        System.out.println(L.sizeRecursion());
        System.out.println(L.sizeInterative());
        System.out.println(L.getRecursion(1));
        System.out.println(L.getInterative(1));
    }

}



