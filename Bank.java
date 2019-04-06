package com.company;


import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Bank {

public void runbank() throws IOException {
    Scanner in = new Scanner(System.in);
    queue_c q[] = new queue_c[4];


    q[0]=new queue_c(1);
    q[1]=new queue_c(2);
    q[2]=new queue_c(3);
    q[3]=new queue_c(4);

    Front_officer f = new Front_officer(q);
    Casier c1 = new Casier(q[0]);
    Casier c2 = new Casier(q[1]);
    Casier c3 = new Casier(q[2]);
    Casier c4 = new Casier(q[3]);

    q[0].addObserver(f);
    q[1].addObserver(f);
    q[2].addObserver(f);
    q[3].addObserver(f);

    ExecutorService ex = Executors.newCachedThreadPool();

    ex.execute(f);
    ex.execute(c1);
    ex.execute(c2);
    ex.execute(c3);
    ex.execute(c4);




}

}
