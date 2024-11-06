public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-121));
    }
    public static boolean isPalindrome(int x) {
        int temp = x , rev = 0;
        while(temp != 0){
            int digit = temp%10;
            rev = rev * 10 + digit;
            temp /= 10;
        }
        return x == rev;

        // return rev;
    }
}
