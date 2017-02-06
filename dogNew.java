/**
 * Created by kuangyang on 1/29/17.
 */
public class dogNew implements OurComparable {
    private String name;
    private int size;

    public dogNew(String n, int s) {
        this.name = n;
        this.size = s;
    }

    public void bark() {
        System.out.println(this.name + "says: " + "Bark!");
    }

    public int compareTo(OurComparable o) {
        dogNew aDog = (dogNew) o;
        return this.size - aDog.size;
    }
}
