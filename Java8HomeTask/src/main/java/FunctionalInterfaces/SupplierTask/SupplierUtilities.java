package FunctionalInterfaces.SupplierTask;

import FunctionalInterfaces.Product;

import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class SupplierUtilities {
    public void getProductUsingSupplier(List<Product> productList) {
        System.out.println("Get random product using Supplier :");
        System.out.println("-----------------------------------");
        Random random = new Random();
        Supplier<Product> supplier = () -> productList.get(random.nextInt(productList.size() - 1));
        System.out.println(supplier.get());
    }

    public void produceOTP() {
        System.out.println("Random number for OTP   :");
        System.out.println("-------------------------");
        Random random = new Random();
        Supplier<Integer> supplier = () -> random.nextInt(100000);
        System.out.println(supplier.get());
    }
}
