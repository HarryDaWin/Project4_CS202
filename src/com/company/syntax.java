/*
base class
 */

package com.company;
import java.util.Scanner;

public class syntax
{
    //Data members
    private String pre_syntax;
    private String post_syntax;
    private Scanner input;

    public syntax()
    {
        pre_syntax = new String();
        post_syntax = new String();
    }

    public syntax(syntax s)
    {
        pre_syntax = s.pre_syntax;
        post_syntax = s.post_syntax;
    }

    public void read()
    {
    }

    public void set_pre(String input)
    {
        pre_syntax = input;
    }

    public void set_post(String input)
    {
        post_syntax = input;
    }

    public void display()
    {
        System.out.print("C++ syntax: ");
        System.out.println(pre_syntax + " { //body }");

        System.out.println("python syntax: ");
        System.out.println(post_syntax);
        System.out.println("    //body");
    }

    public Scanner getInput()
    {
        input = new Scanner(System.in);
        return input;
    }
}
