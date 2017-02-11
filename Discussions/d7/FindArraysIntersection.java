/** Intersection: Now do the same as above, but find the intersection between both
 *  arrays. The intersection of two arrays is the list of all elements that are in
 *  both arrays. Again assume that neither array has duplicates. Ex: Intersection of
 *  1,2,3,4 and 3,4,5,6 is 3,4. Hint: Think about using ADTs other than arrays to
 *  make the code more efficient.
 */

import java.util.HashSet;

public class FindArraysIntersection {
    // Runtime = BigTheta(M + N)
    public static int[] intersection(int[] A, int[] B) {
        HashSet<Integer> setOfA = new HashSet<Integer>();
        HashSet<Integer> intersectionSet = new HashSet<Integer>();
        for (int num : A) {
            setOfA.add(num);
        }
        for (int num : B) {
            if (setOfA.contains(num)) {
                intersectionSet.add(num);
            }
        }
        int[] intersectionArray = new int[intersectionSet.size()];
        int index = 0;
        for (int num : intersectionSet) {
            intersectionArray[index] = num;
            index += 1;
        }
        return intersectionArray;
    }

    public static void traverse(int[] x) {
        for (int num : x) {
            System.out.print(num + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        int[] A = {1, 3, 4, 5, 8};
        int[] B = new int[]{2, 4, 5, 6, 8};
        traverse(intersection(A, B));
    }

}
