public class SquareList {
    public static IntList SquareDestructive_iteration(IntList L) {
        IntList B = L;
        while (B != null) {
            B.head *= B.head;
            B = B.tail;
        }
        return L;
    }

    public static IntList SquareDestructive_recursion(IntList L) {
        if (L == null) {
            return null;
        } else {
            L.head *= L.head;
            SquareDestructive_recursion(L.tail);
        }
        return L;
    }

    public static IntList SquareNonDestructive_iteration(IntList L) {
        IntList B = L.tail;
        IntList new_L = new IntList(L.head * L.head, null);
        IntList P = new_L;
        while (B != null) {
            P.tail = new IntList(B.head  * B.head, null);
            B = B.tail;
            P = P.tail;
        }
        return new_L;
    }

    public static IntList SquareNonDestructive_recursion(IntList L) {
        if (L == null) {
            return L;
        } else {
            IntList tail = SquareNonDestructive_recursion(L.tail);
            IntList new_L = new IntList(L.head * L.head, tail);
            return new_L;
        }
    }

    public static void traverse(IntList L) {
        IntList P = L;
        while (P != null) {
            System.out.print(P.head + " ");
            P = P.tail;
        }
        System.out.print("\n");
    }

    public static void main(String[] args) {
        IntList L = new IntList(10, null);
        L = new IntList(9, L);
        L = new IntList(6, L);
        L = new IntList(5, L);

        traverse(L);
        SquareList.SquareDestructive_iteration(L);
        traverse(L);
        SquareList.SquareNonDestructive_iteration(L);
        traverse(L);
        SquareList.SquareDestructive_recursion(L);
        traverse(L);
        SquareList.SquareNonDestructive_recursion(L);
        traverse(L);
    }
}
