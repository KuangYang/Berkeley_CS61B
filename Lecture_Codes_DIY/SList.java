public class SList {
    private IntNode front;

    private int size;

    public SList() {
        this.front = null;
        size = 0;
    }

    public SList(int x) {
        this.front = new IntNode(x, null);
        size = 1;
    }

    public void insertFront(int x) {
        IntNode oldFront = this.front;
        front = new IntNode(x, oldFront);
        size += 1;
    }

    public void insertBack(int x) {
        if (this.front == null) {
            this.front = new IntNode(x, null);
            size = 1;
            return;
        }

        IntNode p = this.front;

        while (p.next != null) {
            p = p.next;
        }

        p.next = new IntNode(x, null);
        size += 1;
    }

    private static int intNodeSize(IntNode n) {
        if (n.next == null) {
            return 1;
        }

        return 1 + intNodeSize(n.next);
    }

    public int sizeRecursion() {
        return size;
    }

    public int getItem(int i) {
        IntNode p = this.front;

        while (i != 0) {
            p = p.next;
            i -= 1;
        }

        return p.item;
    }

    public static void main(String[] args) {
        SList s1 = new SList();

        s1.insertBack(20);
        s1.insertFront(10);
        s1.insertFront(5);
        s1.insertFront(0);

        System.out.println(s1.getItem(0));
        System.out.println(s1.getItem(1));
        System.out.println(s1.getItem(2));
        System.out.println(s1.getItem(3));
        System.out.println(s1.sizeRecursion());

        //SList s2 = new SList();
        //System.out.println(s2.sizeRecursion());

    }
}
