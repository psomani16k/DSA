public class CheckPalindrome {
    // https://leetcode.com/problems/palindrome-number/submissions/1218202025/
    public static void main(String[] args) {
        int testCase = -84799748;
        System.out.println(isPalindrome(testCase));
    }

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        long reverse = reverse(x);
        return reverse == x;
    }

    public static long reverse(int x) {
        long reverse = 0;
        while (x != 0) {

            reverse *= 10;
            reverse += (x % 10);
            x /= 10;
        }
        return reverse;
    }
}
