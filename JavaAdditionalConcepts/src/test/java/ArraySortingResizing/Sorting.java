package ArraySortingResizing;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        CustomSorting customSorting = new CustomSorting();
        int a[] = {1, 2, 3, 3, 44, 5, 5, 56, 6};
        System.out.println("Array sorting using in built method :");
        Arrays.sort(a);
        int barray[] = customSorting.sortingArray(a);
        System.out.println("Resizing the array  :");
        System.out.println("---------------------");
        Integer array[] = {1, 2, 3, 3, 4, 44, 445, 566, 777, 98};
        System.out.println("Initial array contains " + array.length + " elements.");
        int length = customSorting.resizing(array);
        System.out.println("After resizing array contains " + length + " elements.");
    }
}
