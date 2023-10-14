package FunctionalInterfacesTest.PredicateTaskSolution;

import FunctionalInterfaces.PredicateTask.PredicateUtilities;
import FunctionalInterfaces.Product;
import FunctionalInterfaces.ProductDataSource;

import java.util.List;

public class PredicateSolution {
    public static void main(String[] args) {
        PredicateUtilities predicateUtilities = new PredicateUtilities();
        ProductDataSource productDataSource = new ProductDataSource();
        List<Product> productList = productDataSource.getProducts();

        predicateUtilities.getPriceGreaterThan_1000(productList);
        predicateUtilities.getElectronicsCategoryProducts(productList);
        predicateUtilities.getElectronicProductsPriceGreaterThan_100(productList);
        predicateUtilities.getProductPriceGreaterThan_100_OrElectronics(productList);
        predicateUtilities.getElectronicProductsPriceLessThan_100(productList);
    }
}
