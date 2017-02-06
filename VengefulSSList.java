/**
 * Created by kuangyang on 1/29/17.
 */
public class VengefulSSList<Item> extends SSList<Item> {
    private SSList<Item> deletedItems;

    public VengefulSSList() {
        super();
        this.deletedItems = new SSList<Item>();
    }

    public VengefulSSList(Item x) {
        //super(x);
        this.deletedItems = new SSList<Item>();
    }

    @Override
    public Item deleteBack() {
        // delete the last item ---> Use superclass's method!
        // record the item that was deleted
        // return the deleted item
        Item deletedItem = super.deleteBack();
        this.deletedItems.insertBack(deletedItem);

        return deletedItem;
    }

    public void printLostItems() {
        this.deletedItems.print();
    }

    public static void main(String[] args) {
        VengefulSSList<Integer> vsl = new VengefulSSList<Integer>(9);

        vsl.insertBack(1);
        vsl.insertBack(5);
        vsl.insertBack(10);
        vsl.insertBack(13);

        vsl.deleteBack();
        vsl.deleteBack();

        System.out.println("The fallen are: ");
        vsl.printLostItems();

    }


}
