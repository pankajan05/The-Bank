package com.company;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Casier implements Runnable{
    //File filepath = new File("saved_cust.txt");

    queue_c q;
    Customer c;
    BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Pankajan\\IdeaProjects\\Bank\\src\\com\\company\\saved_cust.txt"));

    public Casier(queue_c a) throws IOException {
        q = a;
    }

    public void run()
    {
        try {
            //if(q.no()==0)
            Thread.sleep(19000);
            while(q.no() > 0){
                c = q.removecust();
                writer.write("customer : " + c.getCustomerId());
                System.out.println("customer "+c.getCustomerId() );
                Thread.sleep(10000);
            }

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void saved()
    {

    }


}
