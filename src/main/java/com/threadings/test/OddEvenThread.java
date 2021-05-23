package com.threadings.test;

public class OddEvenThread {
    static int i=0;

    public static void main(String[] args) {

        OddEven oddEven = new OddEven();

        Runnable even= ()->{
            System.out.println("starting even");
               oddEven.getEven();
        };

        Runnable odd= ()->{
            System.out.println("starting odd");
                oddEven.getOdd();
        };

        Thread t1 = new Thread(even,"even");
        Thread t2 = new Thread(odd,"odd");

        t1.start();
        t2.start();
    }



}
