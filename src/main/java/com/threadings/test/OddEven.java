package com.threadings.test;

public class OddEven {
    static int N=20;
    int counter = 0;
    public void getOdd() {
        synchronized (this) {

            while(counter<N){
                sleep();
                if(counter%2 ==1) {
                    try{
                        this.wait();
                    }catch (InterruptedException e){

                    }
                    System.out.println(counter);
                }
                counter++;
                this.notify();
            }

        }
    }


    public void getEven() {
        synchronized (this) {
            while(counter<N){
                sleep();
                if(counter%2 ==0) {
                    try{
                        this.wait();
                    }catch (InterruptedException e){

                    }
                    System.out.println(counter);
                }

                counter++;
                this.notify();
            }
        }
    }

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

        Thread t1 = new Thread(even);
        Thread t2 = new Thread(odd);

        t1.start();
        t2.start();
    }

    private void sleep(){
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
