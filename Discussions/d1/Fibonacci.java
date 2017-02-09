public class Fibonacci {
    public static int fib_recursion(int N) {
        if (N <= 1) return N;
        return fib_recursion(N - 1) + fib_recursion(N - 2);
    }

    public static int fib_iteration(int N) {
        int f0 = 0;
        int f1 = 1;
        while (N > 0) {
            int temp = f1;
            f1 = f0 + f1;
            f0 = temp;
            N -= 1;
        }
        return f0;
    }

    public static int fib_generic(int n, int k, int f0, int f1) {
        if (n == k) {
            return f0;
        } else {
            return fib_generic(n, k + 1, f1, f0 + f1);
        }
    }

    public static void main(String[] args) {
        System.out.println(fib_recursion(8));
        System.out.println(fib_iteration(8));
        System.out.println(fib_generic(8, 0, 0, 1));
    }
}
