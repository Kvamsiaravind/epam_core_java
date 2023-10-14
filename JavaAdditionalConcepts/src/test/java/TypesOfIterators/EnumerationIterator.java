package TypesOfIterators;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;
import java.util.stream.IntStream;

public class EnumerationIterator {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector();
        for (int i = 1; i < 11; i++)
            vector.addElement(i);
        System.out.println("vector before enumeration iterator    :");
        System.out.println("-------------------------------------");
        System.out.println(vector);
        System.out.println("Vector after enumuration iterator:");
        System.out.println("----------------------------------");
        Enumeration e = vector.elements();
        while (e.hasMoreElements()) {
            System.out.print(e.nextElement() + " ");
        }
    }
}
