public class SSList<myType> implements List61B<myType> {
    public class Node {
        public myType item;
        public Node next;

        public Node(myType i, Node h) {
            this.item = i;
            this.next = h;
        }
    }

    private Node sentinel;
    private int size;

    public SSList() {
        size = 0;
        sentinel = new Node(null, null);
    }

    public SSList(myType x) {
        size = 1;
        sentinel = new Node(null, null);
        sentinel.next = new Node(x, null);

    }

    @Override
    public void insertFront(myType x) {
        Node oldActualFrontNode = sentinel.next;
        sentinel.next = new Node(x, oldActualFrontNode);
        size += 1;
    }

    @Override
    public myType getFront() {
        return this.sentinel.next.item;
    }

    @Override
    public myType getBack() {
        Node p = this.sentinel;

        while (p.next != null) {
            p = p.next;
        }

        return p.item;
    }

    private Node getBackNode() {
        Node p = this.sentinel;

        while (p.next != null) {
            p = p.next;
        }

        return p;
    }

    @Override
    public myType deleteBack() {
        Node oldBackNode = this.getBackNode();
        if (oldBackNode == this.sentinel) {
            return null;
        }

        Node p = this.sentinel;
        while(p.next != oldBackNode) {
            p = p.next;
        }
        p.next = null;
        size -= 1;

        return oldBackNode.item;
    }

    @Override
    public void insert(myType item, int position) {
        if (position > this.size || position < 0) {
            return;
        }

        Node p = this.sentinel;

        int i = position;
        while (i > 0) {
            p = p.next;
            i -= 1;
        }

        Node newNode = new Node(item, p.next);
        p.next = newNode;

        size += 1;
    }

    @Override
    public void insertBack(myType x) {
        Node oldBackNode = this.getBackNode();
        oldBackNode.next = new Node(x, null);

        size += 1;
    }

    @Override
    public myType get(int i) {
        Node p = this.sentinel.next;

        while (i > 0) {
            p = p.next;
            i -= 1;
        }

        return p.item;
    }

    @Override
    public int size() {
        return this.size;
    }

    /** Make print() more efficient for SSList via overriding the default print() */
    @Override
    public void print() {
        for (Node p = this.sentinel.next; p != null; p = p.next) {
            System.out.print(p.item + " ");
        }
        System.out.println();
    }
/*
    public static void main(String[] args) {
        SSList s1 = new SSList();
        System.out.println(s1.getFront());
        System.out.println(s1.getBack());
        System.out.println(s1.size());

        s1.insertBack(20);
        System.out.println(s1.getFront());
        System.out.println(s1.getBack());
        System.out.println(s1.size());

        s1.insertFront(10);
        System.out.println(s1.getFront());
        System.out.println(s1.getBack());
        System.out.println(s1.size());

        s1.insertFront(5);
        System.out.println(s1.getFront());
        System.out.println(s1.getBack());
        System.out.println(s1.size());

        s1.insertFront(0);
        System.out.println(s1.getFront());
        System.out.println(s1.getBack());
        System.out.println(s1.size());
    }*/
}
