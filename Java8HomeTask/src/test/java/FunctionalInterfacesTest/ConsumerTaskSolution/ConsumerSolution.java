package FunctionalInterfacesTest.ConsumerTaskSolution;

import FunctionalInterfaces.ConsumerTask.ConsumerUtilities;
import FunctionalInterfaces.Product;
import FunctionalInterfaces.ProductDataSource;

import java.util.List;
import java.util.function.Consumer;
import java.util.logging.FileHandler;
import java.util.logging.Logger;


public class ConsumerSolution {
    public static void main(String[] args) {
        ConsumerUtilities consumerUtilities = new ConsumerUtilities();
        ProductDataSource productDataSource = new ProductDataSource();
        List<Product> productList = productDataSource.getProducts();

        consumerUtilities.updateGrade(productList);
        consumerUtilities.updateSuffix(productList);
        consumerUtilities.printPremiumProductsHavingSuffix();


        System.out.println("Consumer log files output :");
        System.out.println("---------------------------");
        String stringToPrint="consumerLog";
        Consumer<Product> consumer=new Consumer<Product>() {
            @Override
            public void accept(Product product) {
                if(stringToPrint.equals("consumerLog")){
                    Logger logger=Logger.getLogger("Log");
                    try{
                        FileHandler fileHandler=new FileHandler("log.txt");
                        logger.addHandler(fileHandler);
                        logger.info(product.toString());
                    }
                    catch (Exception exception){
                        System.out.println(exception);
                    }
                }
                else{
                    System.out.println(product);
                }
            }
        };
        productList.stream().forEach(consumer);
    }
}
