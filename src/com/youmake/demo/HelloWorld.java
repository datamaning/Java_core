package com.youmake.demo;

import java.util.Scanner;

/**
 * Created by datamaning on 2016/10/28.
 */
public class HelloWorld {
    public static void  main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.print("What's your name?");
        String name=in.nextLine();
        System.out.print("How old are you?");
        int age=in.nextInt();

    }
}
