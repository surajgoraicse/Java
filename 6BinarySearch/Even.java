
public class Even {

    public static void main(String[] args) {
        System.out.println(checkEven(16));
    }

    public static boolean checkEven(int n) {
        int count = 0;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                if (n / i == i) {
                    count++;
                } else {
                    count += 2;
                }
            }

        }
        return count == 2;
    }
}
