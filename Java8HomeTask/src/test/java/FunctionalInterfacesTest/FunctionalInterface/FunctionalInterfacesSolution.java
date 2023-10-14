package FunctionalInterfacesTest.FunctionalInterface;

import FunctionalInterfaces.Product;
import FunctionalInterfaces.ProductDataSource;
import FunctionalInterfaces.FunctionalInterface.FunctionalInterfaceUtilities;

import java.util.List;

public class FunctionalInterfacesSolution {
    public static void main(String[] args) {
        FunctionalInterfaceUtilities functionalInterfaceUtilities = new FunctionalInterfaceUtilities();
        ProductDataSource productDataSource = new ProductDataSource();
        List<Product> productList = productDataSource.getProducts();

        functionalInterfaceUtilities.getCostOfAllProducts(productList);
        functionalInterfaceUtilities.getCostOfAllProductsPriceGreaterThan_1000(productList);
        functionalInterfaceUtilities.getCostOfAllElectronicProducts(productList);
        functionalInterfaceUtilities.getElectronicProductsPriceGreaterThan_1000(productList);

    }
}
