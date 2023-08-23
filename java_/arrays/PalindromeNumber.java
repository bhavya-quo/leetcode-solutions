package java_.arrays;

public class PalindromeNumber {

    public boolean isPalindrome(int x) {
        if(x < 0 || (x % 10 == 0 && x != 0)) { // cannot be negative or multiple of 10
            return false;
        }
        int num = 0;
        while (x > num) {
            num = num * 10 + x % 10;
            x /= 10;
        }

        return x == num || x == num / 10;
    }
 // write unit tests for above code with multiple inputs and print input with answer
    public static void main(String[] args) {
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        int[] input = {121, 1221, 12321, 123321, 1234321, 12344321, 10, -100, 0, 1};
        for (int i : input) {
            System.out.println(i + " "  + palindromeNumber.isPalindrome(i));
        }
    }
}