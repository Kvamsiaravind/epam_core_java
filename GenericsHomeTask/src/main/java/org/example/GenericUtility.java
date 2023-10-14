package org.example;

public class GenericUtility {

    //Non-Generic Method
    /*
     * Convert this non-generic method to a generic method so that it can
     * compare String, Double, Float and any custom class object like
     * in our case i.e Customer
     */
    public static <T extends Comparable<T>> void receiveLeastValue(T sourceObject,T targetObject) {
        System.out.println(sourceObject.compareTo(targetObject)<0?sourceObject.toString():targetObject.toString());
    }
}
