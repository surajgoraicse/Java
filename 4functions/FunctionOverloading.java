public class FunctionOverloading {
    public static void main(String[] args) {
        fun(10);
        fun(10.0);
    }

    static void fun(int n) {
        System.out.println(n);
    }

    static void fun(double n) {
        System.out.println(n);
        
    }
}
