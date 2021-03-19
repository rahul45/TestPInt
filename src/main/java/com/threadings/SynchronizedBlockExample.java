package com.threadings;

public class SynchronizedBlockExample {
    public  static void main(String[] args) {
        MyClass sc = new MyClass();

        Runnable runnable1 = ()->{
//            for(int i=0;i<1_000_000;i++){
//                cal.add();
//            }
            sc.log2("Hello","there");
            //System.out.println("Count:: "+sc.add(12));
        };
        MyClass sc1 = new MyClass();

        Runnable runnable2 = ()->{
//            for(int i=0;i<1_000_000;i++){
//                cal.add();
//            }
            sc1.log2("Hello1","there1");
            //System.out.println("Count:: "+cal.sub());
        };


        Thread t1=  new Thread(runnable1,"t1");
        Thread t2 = new Thread(runnable2,"t2");

        t1.start();
        t2.start();
    }
}

 class MyClass {

    public synchronized void log1(String msg1, String msg2){
        for(int i=0;i<10;i++){
        System.out.println(msg1);
        System.out.println(msg2);
            try {
                Thread.sleep(1000);
            }catch (Exception e){

            }
            System.out.println("CurrentThread--"+Thread.currentThread().getName());
    }}


    public  static void log2(String msg1, String msg2){

        System.out.println("Starting ....."+Thread.currentThread().getName());
        synchronized(MyClass.class){
            for(int i=0;i<10;i++){
            System.out.println(msg1);
            System.out.println(msg2);
            try {
                Thread.sleep(1000);
            }catch (Exception e){

            }
            System.out.println("CurrentThread--"+Thread.currentThread().getName());
        }}

        System.out.println("Hii there");
    }
}