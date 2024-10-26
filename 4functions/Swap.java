public class Swap {
    public static void main (String[] args) {
        int a = 5 , b = 10;
        swap(a , b);
    }
    static void swap(int a ,  int b){
            int temp ;
            temp = a;
            a = b;
            b = temp;
            System.out.println("Value of a : " + a + " value of b : " + b);
    }
}