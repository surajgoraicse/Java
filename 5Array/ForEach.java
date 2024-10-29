
import java.util.Arrays;

public class ForEach {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3, 4 };
        // for (int num : arr) {
        //     System.out.print(num + " ");
        //     if (num == 21) {
        //         num = 69;
        //         System.out.println("value changed");
        //     }
        // }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
        System.out.println(Arrays.toString(arr));


    }
}
