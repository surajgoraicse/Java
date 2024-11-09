public class Factorial {
    public static void main(String[] args) {
        int f = fact(10);
        System.out.println("factorial : " + f);
    }
    public static int fact(int n){
        // base condition
        if(n==1){
            return 1;
        }
        int f = n * fact(n - 1);
        return f;
    }

}
