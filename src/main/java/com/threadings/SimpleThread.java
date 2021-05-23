package com.threadings;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class SimpleThread {
    public static void main(String[] args) {
        Thread thread = new Thread();
        thread.start();
        multipleThread();
    }

    private static void multipleThread(){
            System.out.println(Thread.currentThread().getName());
        List<String> list = Arrays.asList("A","B","C","D","E");
        list.forEach(elem -> System.out.println(elem) );

        IntStream.iterate(0,i->i+1).limit(10).forEach(i->{
            new Thread("" + i){
                public void run(){
                    System.out.println("Thread: " + getName() + " running");
                }
            }.start();
        });
//            for(int i=0; i<10; i++){
//                new Thread("" + i){
//                    public void run(){
//                        System.out.println("Thread: " + getName() + " running");
//                    }
//                }.start();
//        }
    }
}
