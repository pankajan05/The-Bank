package com.company;

import java.util.*;

public class queue_c extends Observable{
    Vector<String> k = new Vector<String>();
    Stack c = new Stack();

    public Queue<Customer> q = new LinkedList<>();
    private int id=0;

    public queue_c(int x) {
        id = x;
    }

    public void addcust(Customer c) {

            q.add(c);
            System.out.println("cusomer "+c.getCustomerId()+" is added to "+this);
        if(q.size()>=10) {
            setChanged();
            notifyObservers();
        }
    }

    public Customer removecust()
    {
        return q.remove();
    }

    public int no()
    {
        return q.size();
    }


    @Override
    public String toString() {
        return "queue "+id+"{" +
                "c=" + q +
                '}';
    }
}
