import java.lang.Math;

public class myArray {
    public static int[] insert(int[] x, int item, int position) {
        if (position < 0) {
            throw new ArrayIndexOutOfBoundsException("Position should not be less than 0!");
        }
        int[] new_array = new int[x.length + 1];
        position = Math.min(position, x.length);
        for (int i = 0; i < position; i++) {
            new_array[i] = x[i];
        }
        new_array[position] = item;
        for (int i = position; i < x.length; i++) {
            new_array[i + 1] = x[i];
        }
        return new_array;
    }

    public static int[] insert_copy(int[] x, int item, int position) {
        if (position < 0) {
            throw new ArrayIndexOutOfBoundsException("Position should not be less than 0!");
        }
        int[] new_array = new int[x.length + 1];
        position = Math.min(position, x.length);
        System.arraycopy(x, 0, new_array, 0, position);
        new_array[position] = item;
        System.arraycopy(x, position, new_array, position + 1, x.length - position);
        return new_array;
    }

    public static void reverse(int[] x) {
        for (int i = 0; i < x.length / 2; i++) {
            int reverse_index = x.length - 1 - i;
            int temp = x[i];
            x[i] = x[reverse_index];
            x[reverse_index] = temp;
        }
    }

    public static int[] copy_elements(int[] x) {
        int length = 0;
        for (int item : x) {
            length += item;
        }

        int[] copy_array = new int[length];
        int offset = 0;
        for (int item : x) {
            for (int i = offset; i < item + offset; i++) {
                copy_array[i] = item;
            }
            offset += item;
        }
        return copy_array;
    }

    public static void traverse(int[] x) {
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] test = {2, 4, 6, 8, 10, 12};
        traverse(test);
        test = insert(test, 32, 3);
        traverse(test);
        test = insert_copy(test, 64, 9);
        traverse(test);
        test = insert(test, 129, 0);
        traverse(test);
        // test = insert(test, 129, -1);
        // traverse(test);
        reverse(test);
        traverse(test);
        test = new int[]{4, 2, 3, 1};
        test = copy_elements(test);
        traverse(test);
    }
}
