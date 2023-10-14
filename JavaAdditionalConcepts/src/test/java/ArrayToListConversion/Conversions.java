package ArrayToListConversion;

import java.util.Arrays;
import java.util.List;

public class Conversions {
    public static void main(String[] args) {
        ConversionToList conversionToList = new ConversionToList();
        System.out.println("Conversion of array to list:");
        System.out.println("----------------------------");
        Integer arr[] = {1, 2, 3, 4, 4, 5, 6, 6, 7, 7, 7, 78, 8};
        List<Integer> list = conversionToList.arrayToList(arr);
        System.out.println(list);
        System.out.println("Conversion of list to array:");
        System.out.println("---------------------------");
        List<String> listOfStrings = Arrays.asList("abc", "bcd", "jasmine", "rose");
        String array[] = conversionToList.listToArray(listOfStrings);
        for (String s : array)
            System.out.print(s + " ");
    }
}
