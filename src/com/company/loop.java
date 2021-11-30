package com.company;

public class loop extends syntax
{
    private String loop;
    private String conditional;
    private String arg1;
    private String arg2;

    public loop()
    {
    }

    public loop(loop l)
    {
        super(l);
        this.loop = l.loop;
        this.conditional = l.conditional;
        this.arg1 = l.arg1;
        this.arg2 = l.arg2;
    }

    public void convert()
    {
        if(this.loop.equals("while"))
        {
            set_post(loop + " " + arg1 + " " + conditional + " " + arg2 + ":");
        }

        else
        {
            set_post(loop + " (int variable) in range(" + arg1 + "," + arg2 + "):");
        }
    }

    public void read()
    {
        System.out.println("What kind of loop is it(while or for); ");
        loop = getInput().next();
        if(this.loop.equals("while"))
        {
            System.out.println("C++ example while(x == y) ");
            System.out.println("What is the first argument(while(->x<- == y)");
            arg1 = getInput().next();
            System.out.println("What is the conditional statement(while(x ->==<- y)");
            conditional = getInput().next();
            System.out.println("What is the second argument(while(x == ->y<-)");
            arg2 = getInput().next();
            super.set_pre(loop + "(" + arg1 + " " + conditional + " " + arg2 + ")");
        }
        else if(this.loop.equals("for"))
        {
            System.out.println("C++ example for(int i = 0; i < 10; i++ ");
            System.out.println("What is the first argument(int i = ->0<-; i < 10; i++)");
            arg1 = getInput().next();
            System.out.println("What is the conditional statement(int i = 0; i -><<- 10; i++)");
            conditional = getInput().next();
            System.out.println("What is the second argument(int i = ->0<-; i < ->10<-; i++)");
            arg2 = getInput().next();
            super.set_pre(loop + "(int i = " + arg1 + ";" + "i " + conditional + " " + arg2 + "; i++)");
        }
        else
        {
            System.out.println("ERROR didn't type in for or while");
            //read();
        }
        convert();
    }

    public void display()
    {
        super.display();
    }
}
