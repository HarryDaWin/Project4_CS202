package com.company;

public class node
{
    private syntax data;
    private node next;

    public node()
    {
        next = null;
    }

    public node(syntax s)
    {
        if(s instanceof loop)
        {
            this.data = new loop((loop) s);
        }
        this.next = null;
    }

    public void display()
    {
        data.display();
    }

    public void set_next(node ptr)
    {
        this.next = ptr;
    }

    public node get_next()
    {
        return this.next;
    }
}

