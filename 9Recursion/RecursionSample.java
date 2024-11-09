public class RecursionSample {
    public static void main(String[] args) {
        int n = 1;
        message(n);
        System.out.println("program is completed");
    }
    static void message(int n){
        if(n == 6) return ;
        message(n+1);
        System.out.println(n);
    }
}
