package StringUsages;

public class StringMethods {
    public static void main(String[] args) {
        String s = new String("rama");
        System.out.println("String    :" + s);
        StringBuffer sb = new StringBuffer(s);
        sb.reverse();
        System.out.println("Using StringBuffer reverse() string :" + sb.toString());
        StringBuilder stringBuilder = new StringBuilder("Seetha");
        stringBuilder.reverse();
        System.out.println("Reverse StringBuilder using reverse() method    :" + stringBuilder.toString());
    }
}
