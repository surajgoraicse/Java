// The value of the array changes in this code because in Java, arrays are passed to methods by reference, not by value. When you pass an array to the change method, you're passing a reference to the original array, not a copy of it.
// import java.util.Arrays;

public class ChangeArray {
    public static void main(String[] args) {
        int[] arr = { 12, 3, 4, 454, 45, 45, 454, 523, 423 };
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] arr){
        arr[0] = 999;
    }
}
