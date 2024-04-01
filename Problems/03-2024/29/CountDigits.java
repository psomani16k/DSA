import java.util.ArrayList;
import java.util.Iterator;

public class CountDigits {

    // https://www.naukri.com/code360/problems/count-digits_8416387?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
    public static void main(String[] args) {
        int testCase = 1000000000;
        System.out.println(solution(testCase));
    }

    public static int solution(int n) {
        ArrayList<Long> digits = new ArrayList<Long>();
        long factorsOfTen = 10;
        long number = n;
        while (factorsOfTen <= number * 10) {
            long digit = number % factorsOfTen;
            digits.add(digit * 10 / factorsOfTen);
            number -= digit;
            factorsOfTen *= 10;
        }
        int result = 0;
        Iterator<Long> iter = digits.iterator();
        while (iter.hasNext()) {
            Long element = iter.next();
            if (element != 0 && n % element == 0) {
                result++;
            }
        }
        return result;
    }
}