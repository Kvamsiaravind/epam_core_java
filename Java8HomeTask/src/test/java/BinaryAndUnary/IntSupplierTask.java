package BinaryAndUnary;

import java.util.Random;
import java.util.function.IntSupplier;

public class IntSupplierTask {
    public static void getNumberFromIntSupplier() {
        Random random = new Random();
        IntSupplier intSupplier = () -> random.nextInt(5000);
        System.out.println(intSupplier.getAsInt());
    }

    public static void main(String[] args) {
        getNumberFromIntSupplier();
    }
}
