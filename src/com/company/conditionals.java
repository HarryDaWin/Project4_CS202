package com.company;

public class conditionals extends syntax {
    //Data members
    private String statement;
    private String conditional;
    private String arg1;
    private String arg2;

    public conditionals()
    {
    }

    public conditionals(conditionals c)
    {

        super(c);
        this.statement = c.statement;
        this.conditional = c.conditional;
        this.arg1 = c.arg1;
        this.arg2 = c.arg2;
    }
}
