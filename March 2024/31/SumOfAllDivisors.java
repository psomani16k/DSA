public class SumOfAllDivisors {
    public static void main(String[] args) {
        int testCase = 3000000;
        System.out.println(solution(testCase));
    }

    public static int solution(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += getSumOfdivisors(i);
        }
        return sum;
    }

    public static int getSumOfdivisors(int i) {

        int sum = 0;
        int num = 1;
        int counterNum = i;
        while (counterNum >= num) {
            if (i % num == 0) {
                counterNum = i / num;
                sum += num;
                if (num != counterNum) {
                    sum += counterNum;
                }
            }
            num++;
            counterNum = i / num;
        }
        return sum;
    }
}
