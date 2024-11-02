

public class Syntax {
    public static void main(String[] args) {
        int[] myArray = { 69,54,54,21,4,69,54,21,54,69,62,69,4,478} ;
        int n = 69;
        System.out.println(search(myArray, n));

    }

    public static boolean search(int[] arr, int n) {
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n)
                return true;
        }
        return false;
    }

}
