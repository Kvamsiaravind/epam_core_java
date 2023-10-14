package practice;

public class Sample   {

    final static short a = 2;
    public static int b = 0;
    public static void main(String [] args)      {
        for (int c=0; c < 4; c++)
        {
            switch (c)   {
                case 2: System.out.print("a ");

                default: System.out.print("default ");
                case 1: System.out.print("a-1 ");
                            break;

                case 0: System.out.print("a-2 ");
//                            break;
                //defaulta-2 a-1 a default

            }
            System.out.println(c);

        }

    }

}