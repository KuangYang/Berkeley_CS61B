/**
 * Created by kuangyang on 1/29/17.
 */
public class Maximizer {

    public static OurComparable max(OurComparable[] items) {
        int maxIndex = 0;
        for (int i = 0; i < items.length; i++) {
            int cmp = items[i].compareTo(items[maxIndex]);
            if (cmp > 0) {
                maxIndex = i;
            }
        }

        return items[maxIndex];
    }

    public static void main(String[] args) {
        dogNew[] dogs = {new dogNew("Elyse", 5), new dogNew("Stur", 10), new dogNew("Artemesios", 51)};
        dogNew maxDog = (dogNew) Maximizer.max(dogs);
        maxDog.bark();
    }
}


