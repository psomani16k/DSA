public class ReversedInteger {
    // https://leetcode.com/problems/reverse-integer/description/
    public static void main(String[] args) {
        int testCase = 2147447412;
        System.out.println(reverse(testCase));
    }

    public static int reverse(int x) {
        int reverse = 0;

        while (x != 0) {
            if (reverse > Integer.MAX_VALUE / 10 || reverse < Integer.MIN_VALUE / 10) {
                return 0;
            }
            reverse *= 10;
            reverse += (x % 10);
            x /= 10;
        }
        return reverse;
    }
}
