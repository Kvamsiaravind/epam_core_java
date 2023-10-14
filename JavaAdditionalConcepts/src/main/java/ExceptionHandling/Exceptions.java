package ExceptionHandling;

public class Exceptions {
    public void arithmeticException() {
        try {
            int a = 5 / 0;
            System.out.println("Value of a is :" + a);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception occured   :" + e);
        } catch (ArithmeticException e) {
            System.out.println("Exception occured   :" + e);
        }
    }

    public void arrayIndexOutOfBoundsException() {
        try {
            int array[] = new int[5];
            System.out.println("Value of a is :" + array[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception occured   :" + e);
        }
    }

    public void classNotFoundException() {
        try {

            Class.forName("com.javaguides.corejava.Demo");

            ClassLoader.getSystemClassLoader().loadClass("com.javaguides.corejava.Demo");

        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }
    }

    public void defaultExceptionHandler() {
        String value = method();
        System.out.println(value);
    }

    public static String method() {
        try {
            int a = 9 / 18;
            System.out.println(a);
            return "return from try";
        } catch (ArrayIndexOutOfBoundsException e) {
            return "return from catch";
        } finally {
            return "return from finally";
        }
    }
}
