package HashCodeEqualsMethods;

import java.util.Arrays;

public class ComparingMethods {
    public static void main(String[] args) {
        String string = "EPAM";
        String input = "epam";
        System.out.println("Using hashcode method :");
        System.out.println(string.hashCode() == input.hashCode());
        System.out.println(string.hashCode() + "\n" + input.hashCode());
        System.out.println("Equals of method    :" + string.equals(input));
        System.out.println("== method   :" + string == input);
        int a[] = {1, 2, 3, 3, 44, 5, 5, 6};
        System.out.println("toString() method   :" + Arrays.toString(a));
    }
}
