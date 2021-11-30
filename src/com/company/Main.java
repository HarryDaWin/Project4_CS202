
package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner input;
    public static void main(String[] args) {

        //Variables
        list l = new list();
        input = new Scanner(System.in);

        display_menu();
        char cmd = getCmd();

        while(cmd != 'q')
        {
            executeCMD(cmd, l);
            display_menu();
            cmd = getCmd();
        }

    }

    public static void display_menu()
    {
        System.out.println();
        System.out.println("This converts  c++ to python");
        System.out.println("Add a conversion to the list: a");
        System.out.println("Display all of the conversions: d");
        System.out.println("quit: q");

    }

    public static char getCmd()
    {
        char cmd;
        System.out.println("What you're command(a, d, q)");
        cmd = input.next().charAt(0);
        return cmd;
    }

    public static void executeCMD(char cmd, list l)
    {
        switch (cmd)
        {
            case 'a':
                add(l);
                break;
            case 'd':
                l.display();
                break;
            default:
                System.out.println("Illegal Command");
                break;
        }
    }

    public static void add(list l)
    {
        String temp;
        System.out.println("Are you trying to convert(loop, conditionals, functions");
        temp = input.next();
        if(temp.equals("loop"))
        {
            syntax base =  new loop();
            base.read();
            l.add(base);
        }

    }
}

