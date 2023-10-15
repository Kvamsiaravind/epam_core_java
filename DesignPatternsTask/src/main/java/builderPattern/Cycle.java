package builderPattern;


import java.util.Objects;

public class Cycle {
    private String cycleName;
    private String color;
    private double cost;

    private boolean gears;
    private boolean doubleStands;
    private boolean doubleSeats;
    private boolean carrier;

    public static CycleBuilder builder() {
        return new CycleBuilder();
    }

    public static class CycleBuilder {
        private String cycleName;
        private String color;
        private double cost;

        private boolean gears;
        private boolean doubleStands;
        private boolean doubleSeats;
        private boolean carrier;

        public CycleBuilder cycleName(final String cycleName) {
            this.cycleName = cycleName;
            return this;
        }

        public CycleBuilder color(final String color) {
            this.color = color;
            return this;
        }

        public CycleBuilder cost(final double cost) {
            this.cost = cost;
            return this;
        }

        public CycleBuilder gears(final boolean gears) {
            this.gears = gears;
            return this;
        }

        public CycleBuilder doubleStands(final boolean doubleStands) {
            this.doubleStands = doubleStands;
            return this;
        }

        public CycleBuilder doubleSeats(final boolean doubleSeats) {
            this.doubleSeats = doubleSeats;
            return this;
        }

        public CycleBuilder carrier(final boolean carrier) {
            this.carrier = carrier;
            return this;
        }

        public Cycle build() {
            if (!Objects.nonNull(cycleName) || !Objects.nonNull(color) || !Objects.nonNull(cost)) {
                throw new RuntimeException("Required parameters missing");
            }

            Cycle cycle = new Cycle();
            cycle.cycleName = cycleName;
            cycle.color = color;
            cycle.cost = cost;
            cycle.doubleStands = doubleStands;
            cycle.doubleSeats = doubleSeats;
            cycle.gears = gears;
            cycle.carrier = carrier;
            return cycle;
        }
    }

    @Override
    public String toString() {
        return "Cycle{" +
                "cycleName='" + cycleName + '\'' +
                ", color='" + color + '\'' +
                ", cost=" + cost +
                ", gears=" + gears +
                ", doubleStands=" + doubleStands +
                ", doubleSeats=" + doubleSeats +
                ", carrier=" + carrier +
                '}';
    }
}