public class Sort {

    /* Returns the index of the smallest string starting with index k.
     * ([0, 2, 3], 1) --> 1  */
    public static int indexOfSmallest(String[] inputs, int k) {
        /* The index of the smallest known so far */
        int minIndex = k;

        for (int i = k; i < inputs.length; i++) {
            int cmp = inputs[i].compareTo(inputs[minIndex]);

            if (cmp < 0) {
                minIndex = i;
            }
        }

        return minIndex;
    }

    private static void swap(String[] inputs, int a, int b) {
        String temp = inputs[a];
        inputs[a] = inputs[b];
        inputs[b] = temp;
    }

    /** Returns inputs in sorted order, sorting only the last
        k items. */
    private static String[] sort(String[] inputs, int k) {
        // find smallest item
        // move smallest item to front
        // sort rest of the stuff
        if (k == inputs.length) {
            return inputs;
        }

        int minIndex = indexOfSmallest(inputs, k);
        swap(inputs, k, minIndex);

        return sort(inputs, k + 1);

    }

    public static String[] sort(String[] inputs) {
        // Selection Sort in Recursive Version
        return sort(inputs, 0);
    }

    public static void print(String[] inputs) {

    }

    public static void main(String[] args) {

    }
}
