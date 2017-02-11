/** Union: Write the code that returns an array that is the union between two given
 *  arrays. The union of two arrays is a list that includes everything that is in
 *  both arrays, with no duplicates. Assume the given arrays do not contain
 *  duplicates. Ex: Union of 1,2,3,4 and 3,4,5,6 is 1,2,3,4,5,6. Hint: The method
 *  should run in O(M+N) time where M and N are the sizes of the two arrays.
 */

import java.util.HashSet;

public class ArrayUnion {
    public static int[] union(int[] A, int[] B) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int num : A) {
            set.add(num);
        }
        for (int num : B) {
            set.add(num);
        }
        int[] unionArray = new int[set.size()];
        int index = 0;
        for (int num : set) {
            unionArray[index] = num;
            index += 1;
        }
        return unionArray;
    }

    public static void traverse(int[] x) {
        for (int num : x) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] A = {1, 3, 4, 5};
        int[] B = new int[]{2, 4, 5, 6, 8};
        traverse(union(A, B));
    }
}
