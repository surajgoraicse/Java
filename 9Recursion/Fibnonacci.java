public class Fibnonacci {
    public static void main(String[] args) {
        System.out.println(fib(10));
    }
    public static int fib(int n) {
        if (n <= 1) { // Base case
            return n;
        }
        return fib(n-1) + fib(n-2); // Recursive case
    }

}
