/** Given an integer x and a sorted array A[] of N distinct integers, design an
 *  algorithm to find if there exists indices i and j such that A[i] + A[j] == x.
 */

public class FindTwoIntSum {
    // Worst = O(N^2), Best = W(1)
    public static boolean findSum(int[] A, int x) {
        if (A.length == 0) {
            return false;
        }
        if (A.length == 1) {
            return (A[0] == x);
        }
        for (int i = 0; i < A.length; i++) {
            for (int j = i + 1; j <  A.length; j++) {
                if (A[i] + A[j] == x) {
                    return true;
                }
            }
        }
        return false;
    }

    // Worst = O(N), Best = W(1)
    public static boolean findSum_Fast(int[] A, int x) {
        if (A.length == 0) {
            return false;
        }
        if (A.length == 1) {
            return (A[0] == x);
        }
        int i = 0;
        int j = A.length - 1;
        while (j > i) {
            if (A[i] + A[j] > x) {
                j -= 1;
            } else if (A[i] + A[j] < x) {
                i += 1;
            } else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] test = {1, 8, 10, 15, 24, 36};
        int x = 39;
        System.out.println(findSum(test, x));
        System.out.println(findSum_Fast(test, x));

        test = new int[]{8};
        x = 8;
        System.out.println(findSum(test, x));
        System.out.println(findSum_Fast(test, x));

        test = new int[]{};
        x = 8;
        System.out.println(findSum(test, x));
        System.out.println(findSum_Fast(test, x));
    }

}
