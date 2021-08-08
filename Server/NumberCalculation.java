import java.math.BigInteger;

public class NumberCalculation {

    public NumberCalculation() {
    }

    public int evenNumber(int a, int b) {

        int evenCounter = 0;

        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                evenCounter++;
            }
        }

        System.out.println("Finished even numbers: " + evenCounter);

        return evenCounter;

    }

    public int oddNumber(int a, int b) {

        int oddCounter = 0;

        for (int i = a; i <= b; i++) {
            if (i % 2 != 0) {
                oddCounter++;
            }
        }

        System.out.println("Finished odd numbers: " + oddCounter);

        return oddCounter;

    }

    public int primeNumber(int a, int b) {

        int primeCounter = 0;

        for (int i = a; i <= b; i++) {

            BigInteger bigInt = BigInteger.valueOf(i);
            if (bigInt.isProbablePrime(100)) {
                primeCounter++;
            }

        }

        System.out.println("Finished prime numbers: " + primeCounter);

        return primeCounter;

    }

    public int compositeNumber(int a, int b) {

        int compositeCounter = 0;

        for (int i = a; i <= b; i++) {

            BigInteger bigInt = BigInteger.valueOf(i);
            if (!bigInt.isProbablePrime(100)) {
                compositeCounter++;
            }

        }

        System.out.println("Finished composite numbers: " + compositeCounter);

        return compositeCounter;

    }

    public int perfectNumber(int a, int b) {

        int perfectCounter = 0;

        for (int number = a; number <= b; number++) {
            int sum = 0;

            for (int i = 1; i <= number / 2; i++) {
                if (number % i == 0) {
                    sum += i;
                }
            }
            if (sum == number) {
                System.out.println(number + " is perfect");
                perfectCounter++;
            }
        }

        System.out.println("Finished perfect numbers: " + perfectCounter);

        return perfectCounter;

    }

}
