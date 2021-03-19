package com.threadings;

public class Counter {

    private volatile long count = 0;

    public long incAndGet(){
        synchronized (this) {
            this.count++;
            return this.count;
        }    }

    public long getCount() {
        synchronized (this){
        return count;
        }
    }

}