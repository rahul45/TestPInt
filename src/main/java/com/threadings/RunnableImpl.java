package com.threadings;

public class RunnableImpl implements Runnable {

    @Override
    public void run() {
        System.out.println("Runnable Imple");
    }
    public static void main(String[] args) {
        RunnableImpl r = new RunnableImpl();
        Thread thread = new Thread(r,"ImplThread");
        thread.start();
        System.out.println("Name--"+thread.getName());
        Thread a = Thread.currentThread();
        System.out.println("Name--"+a.getName());
    }
}
