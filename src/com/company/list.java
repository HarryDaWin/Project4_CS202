package com.company;

public class list {
    private node head;

    public list() {
        head = null;
    }

    public void add(syntax s) {
        node new_node = new node(s);
        node curr = this.head;
        this.head = new_node;
        if (curr != null) {
            this.head.set_next(curr);
        }
    }

    public void display() {
        if (this.head == null) return;
        display(this.head);
    }

    public void display(node head)
    {
        if(head == null)
            return;
        head.display();
        display(head.get_next());
    }
}
