import java.util.ArrayList;
import java.util.Scanner;

public class CheckArmstrong {
    // https://www.naukri.com/code360/problems/check-armstrong_589?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSION
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        checkArmstrong(n);
        input.close();
    }

    public static void checkArmstrong(int n) {
        ArrayList<Integer> digits = new ArrayList<Integer>();
        int number = n;
        while (n > 0) {
            int digit = n % 10;
            digits.add(digit);
            n /= 10;
        }

        int sum = 0;
        for (int i = 0; i < digits.size(); i++) {
            sum += Math.pow(digits.get(i), digits.size());
        }

        if (sum == number) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
