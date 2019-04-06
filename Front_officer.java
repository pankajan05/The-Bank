package com.company;

import org.omg.CORBA.Object;

import java.util.Observable;
import java.util.Observer;
import java.util.Scanner;

public class Front_officer implements Observer,Runnable{
    public queue_c q[];
    //public queue_c o;
    Scanner in = new Scanner(System.in);

    public Front_officer(queue_c q[]) {
        this.q = q;

    }

   public void run()
   {
       int i,y=40;

       while (y>39 ||y<0) {
           System.out.printf("Enter the no of customers: ");
           y = in.nextInt();
       }

       for(i=0; i<y; i++) {
           try {
               Thread.sleep(1500);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }

           if(i<=8)
               q[(i%4)].addcust(new Customer(i));
           else
           q[0].addcust(new Customer(i));
       }
   }

    @Override
    public void update(Observable o, java.lang.Object arg) {
        //this.o = (queue_c)o;
        for(int y =0; y<9; y++) {
            Customer c = ((queue_c) o).removecust();
            q[(y%3)+1].addcust(c);
        }
    }
}