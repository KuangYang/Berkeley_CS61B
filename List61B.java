/** Define a list interface for all lists */

public interface List61B<myType> {
    // Every method in an interface must be public, so public is redundant
    public void insertFront(myType x);
    public myType getFront();
    public void insertBack(myType x);
    public myType getBack();
    public myType deleteBack();
    public myType get(int position);
    public int size();
    public void insert(myType item, int position);

    // Unless you use the keyword default, a method will be abstract
    default public void print() {
        for (int i = 0; i < size(); i++) {
            System.out.print(get(i) + " ");
        }
        System.out.println();
    }
}
