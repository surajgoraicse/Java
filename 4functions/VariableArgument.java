
import java.util.Arrays;

public class VariableArgument {
    public static void main(String[] args) {
        // nums(3243, 4, 3, 43, 43, 43, 4, 34);
        fun(12, 243, 343, 43, 4, 3, 43, 4, 3);
    }
    
    static void nums(int... n) {
        System.out.println(Arrays.toString(n));
    }

    static void fun(int a, int b, int... c) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(Arrays.toString(c));
    }
}
