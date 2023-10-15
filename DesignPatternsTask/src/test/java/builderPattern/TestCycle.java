package builderPattern;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class TestCycle {

    private static final Logger logger = LogManager.getLogger(TestCycle.class);

    public static void main(String[] args) {
        Cycle cycle1 = Cycle.builder()
                .cycleName("Hero")
                .color("red")
                .cost(15000.0)
                .build();
        System.out.println(cycle1);

        Cycle cycle = Cycle.builder()
                .cycleName("Hero")
                .color("red")
                .cost(15000.0)
                .gears(true)
                .doubleSeats(true)
                .build();
        System.out.println(cycle);
    }
}
