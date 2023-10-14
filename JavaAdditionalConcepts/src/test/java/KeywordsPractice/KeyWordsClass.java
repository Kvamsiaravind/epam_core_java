package KeywordsPractice;
import java.io.*;
public class KeyWordsClass {
    static int a=5;
    public static void main(String[] args) throws IOException{

        Child obj=new Child();
        System.out.println("Check the 'obj' is object of Child or not :");
        System.out.println(obj instanceof Child);
        int c=0;
        System.out.println("static value declared in class and outside method :"+a);

        final int value=26;
        System.out.println("final declared values can not be changed :"+value);

        try{
            int b=5/0;
            throw new ArithmeticException();
        }catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        catch (ArithmeticException e)
        {
            System.out.println(e);
        }
        finally {
            System.out.println("Finally block executed.");
        }

        System.out.println("break the loop when 7 multiple occur :");
        for(int i=2;i<10;i++)
        {
            if(i%7==0)
                break;
            else if(i==5)
                continue;
            else
                c=c+1;
        }
        System.out.println("for loop iterates "+c+" times.");
    }
}

