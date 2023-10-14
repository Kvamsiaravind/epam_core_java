package FunctionalInterfaces.FunctionalInterface;

import FunctionalInterfaces.Product;

import java.util.List;
import java.util.stream.Collectors;

public class FunctionalInterfaceUtilities {

    public void getCostOfAllProducts(List<Product> productList) {
        System.out.println("Cost of all products    :");
        System.out.println("-------------------------");
        double cost = productList.stream().collect(Collectors.summingDouble(Product::getPrice));
        System.out.println(cost);
    }

    public void getCostOfAllProductsPriceGreaterThan_1000(List<Product> productList) {
        System.out.println("Total cost of all products whose price greater than 1000:");
        System.out.println("---------------------------------------------------------");
        double cost = productList.stream().filter(product -> product.getPrice() > 1000).collect(Collectors.summingDouble(Product::getPrice));
        System.out.println(cost);
    }

    public void getCostOfAllElectronicProducts(List<Product> productList) {
        System.out.println("Total cost of all electronic products   :");
        System.out.println("-----------------------------------------");
        double cost = productList.stream().filter(product -> product.getCategory().equals("Electronics")).collect(Collectors.summingDouble(Product::getPrice));
        System.out.println(cost);
    }

    public void getElectronicProductsPriceGreaterThan_1000(List<Product> productList) {
        System.out.println("Electronics products which price greater than 1000 :");
        System.out.println("----------------------------------------------------");
        productList.stream().filter(product -> product.getCategory().equals("Electronics"))
                .filter(product -> product.getPrice() > 1000)
                .forEach(product -> System.out.println(product));
    }
}
