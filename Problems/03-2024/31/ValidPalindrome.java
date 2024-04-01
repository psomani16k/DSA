public class ValidPalindrome {
    // https://leetcode.com/problems/valid-palindrome/
    public static void main(String[] args) {
        String testString = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(testString));
    }

    public static boolean isPalindrome(String s) {
        if (s.isEmpty()) {
            return true;
        }
        int start = 0;
        int end = s.length() - 1;
        while (start <= end) {
            char currentStart = s.charAt(start);
            char currentEnd = s.charAt(end);
            if (!Character.isLetterOrDigit(currentStart)) {
                start++;
            } else if (!Character.isLetterOrDigit(currentEnd)) {
                end--;
            } else {
                if (Character.toLowerCase(currentStart) != Character.toLowerCase(currentEnd)) {
                    return false;
                }
                start++;
                end--;
            }
        }
        return true;
    }
}
