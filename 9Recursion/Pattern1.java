    // 123454321
public class Pattern1 {
    public static void main(String[] args) {
        printPattern(1);
    }
    static void printPattern(int n){
        // base condition
        if(n == 5){
            System.out.print(n);
            return ;
        }
        System.out.print(n);
        printPattern(n + 1 );
        System.out.print(n);
    }
}
