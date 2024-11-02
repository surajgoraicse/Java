
import java.util.Scanner;

public class Largest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size;
        size = input.nextInt();
        int[] arr = new int[size];
        System.out.println("enter element of array");

        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("enter start and end");
        int start = input.nextInt();
        int end= input.nextInt();

        System.out.println(findMax(arr , start , end));

    }

    static int findMax(int[] arr ,int start ,  int end ) {
        int max = Integer.MIN_VALUE;
        for (int i = start; i <end; i++) {
            if (max < arr[i])
                max = arr[i];
        }
        return max;
    }
}
