package FunctionalInterfaces.ConsumerTask;

import FunctionalInterfaces.Product;

import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class ConsumerUtilities {
    List<Product> premiumList;

    public void updateGrade(List<Product> productList) {
        System.out.println("Update the grade as premium which having price greater than 1000 :");
        System.out.println("------------------------------------------------------------------");
        premiumList = productList.stream().filter(product -> product.getPrice() > 1000)
                .peek(new Consumer<Product>() {
                    @Override
                    public void accept(Product product) {
                        product.setGrade("Premium");
                    }
                }).collect(Collectors.toList());
        premiumList.forEach(product -> System.out.println(product));
        System.out.println();
    }

    public void updateSuffix(List<Product> productList) {
        System.out.println("Update the suffix for name which having price greater than 3000 :");
        System.out.println("------------------------------------------------------------------");
        productList.stream().filter(product -> product.getPrice() > 3000)
                .peek(new Consumer<Product>() {
                    @Override
                    public void accept(Product product) {
                        product.setName(product.getName() + " *");
                    }
                })
                .forEach(product -> System.out.println(product));
        System.out.println();
    }

    public void printPremiumProductsHavingSuffix() {
        System.out.println("Printing premium products having suffix '*' :");
        System.out.println("---------------------------------------------");
        premiumList.stream().filter(product -> product.getPrice() > 3000)
                .peek(new Consumer<Product>() {
                    @Override
                    public void accept(Product product) {
                        product.setName(product.getName());
                    }
                })
                .forEach(System.out::println);
        System.out.println();
    }
}
