package practicepatterns.iteratorpattern;

public class Solution {
    public static void main(String[] args) {
        CollectionofNames collectionofNames = new CollectionofNames();
        Iterator iter = collectionofNames.getIterator();
        while(iter.hasNext()){
            String name = (String)iter.next();
            System.out.println("Name : " + name);
        }
    }
}
