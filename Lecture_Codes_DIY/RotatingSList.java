public class RotatingSList<Item> extends SSList<Item> {

    public void rotateRight() {
        Item oldBack = deleteBack();
        this.insertFront(oldBack);
        System.out.println("Yang Kuang!");
    }

    public static void main(String[] args) {
        RotatingSList<Integer> rsl = new RotatingSList<Integer>();

        /* Creats SList: [10, 11, 12, 13] */
        rsl.insertBack(10);
        rsl.insertBack(11);
        rsl.insertBack(12);
        rsl.insertBack(13);

        rsl.print();
        /* After rotateRight, should be [13, 10, 11, 12] */
        rsl.rotateRight();
        rsl.print();

    }
}