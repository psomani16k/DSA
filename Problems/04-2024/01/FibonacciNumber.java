public class FibonacciNumber {
    public static void main(String[] args) {
        int testCase = 5;
        System.out.println(fibDynamicPrograming(testCase));
    }

    public static int fibRecursion(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            return fibRecursion(n - 1) + fibRecursion(n - 2);
        }
    }

    public static int fibDynamicPrograming(int n) {
        if (n < 2) {
            return n;
        }
        int[] results = new int[n + 1];
        results[0] = 0;
        results[1] = 1;
        for (int i = 2; i < n + 1; i++) {
            results[i] = results[i - 1] + results[i - 2];
        }
        return results[n];
    }

}
