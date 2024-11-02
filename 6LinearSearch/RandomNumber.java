public class RandomNumber {
    public static void main(String[] args) {
        // int n = (int) (Math.random() * 11);
        int min = 10, max = 20;
        for (int i = 0; i <= 10; i++) {
            System.out.println((int) (Math.random() * (max - min  + 1) + min));
        }
    }
}
