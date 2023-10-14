package ArraySortingResizing;

import java.io.CharConversionException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CustomSorting {
    public int[] sortArray(int a[]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a;
    }

    public int resizeArray(Integer a[]) {
        List<Integer> list = Arrays.asList(a);

        int b[] = new int[list.size() + 1];
        b[list.size()] = 101;
        return b.length;
    }
}
