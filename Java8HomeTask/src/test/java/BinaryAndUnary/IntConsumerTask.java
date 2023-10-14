package BinaryAndUnary;

import java.util.function.IntConsumer;

public class IntConsumerTask {
    public static void squareTheGivenNumber(int value) {
        IntConsumer intConsumer = number -> {
            System.out.println(Math.pow(value, 2));
        };
        intConsumer.accept(value);
    }

    public static void main(String[] args) {
        squareTheGivenNumber(12);
    }
}
