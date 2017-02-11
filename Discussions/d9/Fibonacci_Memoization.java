import java.util.Map;
import java.util.HashMap;

public class Fibonacci_Memoization {
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

    public int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        if (this.map.containsKey(n)) {
            return this.map.get(n);
        }
        this.map.put(n, fib(n - 2) + fib(n - 1));
        return fib(n - 2) + fib(n - 1);
    }

    public static void main(String[] args) {
        Fibonacci_Memoization test = new Fibonacci_Memoization();
        System.out.println(test.fib(8));
    }
}
