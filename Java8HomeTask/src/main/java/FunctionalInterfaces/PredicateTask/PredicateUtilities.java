package FunctionalInterfaces.PredicateTask;

import FunctionalInterfaces.Product;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateUtilities {
    public void getPriceGreaterThan_1000(List<Product> productList) {
        System.out.println("Product price greater than 1000 :");
        System.out.println("---------------------------------");
        productList.stream().filter(new Predicate<Product>() {
                    @Override
                    public boolean test(Product product) {
                        return product.getPrice() > 1000;
                    }
                })
                .forEach(product -> System.out.println(product));
        System.out.println();
    }

    public void getElectronicsCategoryProducts(List<Product> productList) {
        System.out.println("Products belongs to Electronics category :");
        System.out.println("------------------------------------------");
        productList.stream().filter(new Predicate<Product>() {
                    @Override
                    public boolean test(Product product) {
                        return product.getCategory().equals("Electronics");
                    }
                })
                .forEach(product -> System.out.println(product));
        System.out.println();
    }

    public void getElectronicProductsPriceGreaterThan_100(List<Product> productList) {
        System.out.println("Electronics products which price greater than 100 :");
        System.out.println("---------------------------------------------------");
        productList.stream().filter(new Predicate<Product>() {
                    @Override
                    public boolean test(Product product) {
                        return product.getCategory().equals("Electronics") && product.getPrice() > 100;
                    }
                })
                .forEach(System.out::println);

    }

    public void getProductPriceGreaterThan_100_OrElectronics(List<Product> productList) {
        System.out.println("Product price greater than 100 or product belongs to electronics :");
        System.out.println("------------------------------------------------------------------");
        productList.stream().filter(new Predicate<Product>() {
                    @Override
                    public boolean test(Product product) {
                        return product.getPrice() > 100 || product.getCategory().equals("Electronics");
                    }
                })
                .forEach(product -> System.out.println(product));
        System.out.println();
    }

    public void getElectronicProductsPriceLessThan_100(List<Product> productList) {
        System.out.println("Electronics products which price less than 100 :");
        System.out.println("------------------------------------------------");
        productList.stream().filter(new Predicate<Product>() {
                    @Override
                    public boolean test(Product product) {
                        return product.getPrice() < 100 && product.getCategory().equals("Electronics");
                    }
                })
                .forEach(product -> System.out.println(product));
    }
}
