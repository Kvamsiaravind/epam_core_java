package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        Scanner sc=new Scanner(System.in);
        int rollNo=sc.nextInt();
        String name=sc.nextLine();
        System.out.println("Roll no:"+rollNo+" Name:"+name);
    }
}
