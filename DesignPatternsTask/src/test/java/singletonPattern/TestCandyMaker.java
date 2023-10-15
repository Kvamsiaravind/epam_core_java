package singletonPattern;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestCandyMaker {
    public static void createInstance() {
        CandyMaker user = CandyMaker.getGlobalInstance();
        System.out.println(user);
    }

    public static void main(String[] args) {
        ExecutorService distributor = Executors.newFixedThreadPool(5);
        distributor.submit(TestCandyMaker::createInstance);
        distributor.submit(TestCandyMaker::createInstance);
        distributor.shutdown();
    }
}
