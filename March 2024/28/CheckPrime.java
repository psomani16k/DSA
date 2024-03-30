import java.util.HashSet;

public class CheckPrime {
    // https://www.naukri.com/code360/problems/check-prime_624934?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
    public static void main(String[] args) {
        System.out.println(isPrime(29));
    }

    public static String isPrime(int num) {
        HashSet<Integer> factorSet = new HashSet<Integer>();
        factorSet.add(1);
        factorSet.add(num);

        if (num % 2 == 0) {
            factorSet.add(2);
            return "NO";
        } else {
            for (int factor = 3; factor < (num + 1) / 2; factor = factor + 2) {
                if (num % factor == 0) {
                    factorSet.add(factor);
                    return "NO";
                }
            }
        }
        if (factorSet.size() == 1) {
            return "NO";
        }
        return "YES";
    }

}