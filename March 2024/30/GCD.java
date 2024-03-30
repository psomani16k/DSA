public class GCD {
    // https://www.naukri.com/code360/problems/hcf-and-lcm_840448?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
    public static void main(String[] args) {
        int testCase = 20;
        int testCase2 = 8092;
        System.out.println(calcGCD(testCase, testCase2));

    }

    public static int calcGCD(int n, int m) {
        if (n < m) {
            return gcd(m, n);
        } else if (n == m) {
            return n;
        } else {
            return gcd(n, m);
        }
    }

    public static int gcd(int largerNum, int smallerNum) {
        if (largerNum % smallerNum == 0) {
            return smallerNum;
        } else {
            return calcGCD(largerNum - smallerNum, smallerNum);
        }
    }
}
