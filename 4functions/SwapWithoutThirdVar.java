
public class SwapWithoutThirdVar {

    public static void main(String[] args) {
        int a = 51, b = 10;
        swap(a, b);
    }

    static void swap(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Value of a : " + a + " value of b : " + b);
        
    }
}
