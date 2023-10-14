package ArrayToListConversion;

import java.util.Arrays;
import java.util.List;

public class ConversionToList {
    public List<Integer> arrayToList(Integer[] arr) {
        return Arrays.asList(arr);
    }

    public String[] listToArray(List<String> list) {
        String stringArray[] = list.toArray(new String[0]);
        return stringArray;
    }
}
