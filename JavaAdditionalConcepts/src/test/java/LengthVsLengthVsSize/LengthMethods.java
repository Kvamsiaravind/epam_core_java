package LengthVsLengthVsSize;

import java.util.Arrays;
import java.util.List;

public class LengthMethods {
    public static void main(String[] args) {
        Integer arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12};
        System.out.println("get count of elements in array :" + arr.length);
        String string = new String("Welcome");
        System.out.println("get total count of characters in a string :" + string.length());
        List<Integer> list = Arrays.asList(1, 2, 23, 3, 4, 4, 5, 5, 6, 66, 7, 7);
        System.out.println("get count of elements in a list :" + list.size());
    }
}
