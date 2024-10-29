
import java.util.Scanner;

public class Display {

    public static void main(String[] args) {

        int[][] arr = new int[4][4];
        inputNums(arr);
        displayNums(arr);

    }

    static void inputNums(int[][] arr) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers in 4x4 array");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = input.nextInt();
            }
            System.out.println();
        }
    }

    static void displayNums(int[][] arr) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
