
import java.util.Scanner;

public class TemperatureConvertion {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter temperature in fahrenheit");
        int fah = input.nextInt();
        double cel =  5 / 9.0f * (fah - 32) ;
        System.out.println(cel);
    }
}