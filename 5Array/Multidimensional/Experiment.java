
import java.util.Arrays;





public class Experiment {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 34, 34, 3, 4 };
        int[] arr2 = { 34, 34, 3, 43, 12 };
        int[] arr3 = { 1, 2 };
        int[][] doubleDim = { arr1, arr2, arr3 };
        display(doubleDim);

    }

    static void display(int[][] arr) {

        // for (int[] item : arr) {
        //     for (int element : item) {
        //         System.out.print(element + " ");
        //     }
        //     System.out.println();
        // }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        
    }
}
