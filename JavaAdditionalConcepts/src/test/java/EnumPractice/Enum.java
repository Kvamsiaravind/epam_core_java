
public class Enum {
    public enum Fruits {Apple, banana, Guava};

    enum Day {SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY};


    public static void main(String[] args) {
        for (Fruits fruits : Fruits.values()) {
            System.out.println(fruits);
        }
        System.out.println("value of apple is: " + Fruits.valueOf("Apple"));
        System.out.println("index of guava is: " + Fruits.valueOf("Guava").ordinal());

        Day day = Day.MONDAY;
        switch (day) {
            case SUNDAY:
                System.out.println("sunday");
                break;
            case MONDAY:
                System.out.println("monday");
                break;
            default:
                System.out.println("other day");
        }
    }
}
