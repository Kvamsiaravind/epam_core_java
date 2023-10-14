package FunctionalInterfacesTest.SupplierTaskSolution;

import FunctionalInterfaces.SupplierTask.SupplierUtilities;
import FunctionalInterfaces.Product;
import FunctionalInterfaces.ProductDataSource;

import java.util.List;

public class SupplierSolution {
    public static void main(String[] args) {
        SupplierUtilities supplierUtilities = new SupplierUtilities();
        ProductDataSource productDataSource = new ProductDataSource();
        List<Product> productList = productDataSource.getProducts();

        supplierUtilities.getProductUsingSupplier(productList);
        supplierUtilities.produceOTP();
    }
}
