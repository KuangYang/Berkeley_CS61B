/** Given an integer x and a sorted array A[] of N distinct integers, design an
 *  algorithm to find if there exists distinct indices i, j, and k such that
 *  A[i] + A[j] + A[k] == x. Feel free to write pseudocode instead of Java. Your
 *  code should run in BigTheta(N^2) time.
 */

public class FindThreeIntSum {
    public static boolean findThreeSum(int[] arr, int x) {
        if (arr.length < 3) {
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            int j = i + 1;
            int k = arr.length - 1;
            while (j < k) {
                if (arr[i] + arr[j] + arr[k] > x) {
                    k -= 1;
                } else if (arr[i] + arr[j] + arr[k] < x) {
                    j += 1;
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] test = {1, 2, 4, 8, 16, 32};
        int x = 42;
        System.out.println(findThreeSum(test, x));
        x = 100;
        System.out.println(findThreeSum(test, x));
    }
}
