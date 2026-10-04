public class Fibonacci_Recursion {

    static int fibonacci(int n) {

        // Base cases
        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        // Recursive case
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {

        int x = fibonacci(10);

        System.out.println(x);
    }
}