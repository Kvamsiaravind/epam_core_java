package BinaryAndUnary;

import java.util.function.IntPredicate;


public class IntPredicateTask {

    public static void checkPrimeNumberUsingIntPredicate(int value) {
        IntPredicate intPredicate = (number) -> {
            if (number < 2)
                return false;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0)
                    return false;
            }
            return true;
        };
        System.out.println(intPredicate.test(value) ? " Prime number" : " Not a prime number");
    }

    public static void main(String[] args) {
        checkPrimeNumberUsingIntPredicate(3);

    }
}
