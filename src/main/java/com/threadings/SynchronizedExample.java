package com.threadings;

/**
 * Synchronized blocks in Java are marked with the synchronized keyword. A synchronized block in Java is synchronized on some object. All synchronized blocks synchronized on the same object can only have one thread executing inside them at the same time. All other threads attempting to enter the synchronized block are blocked until the thread inside the synchronized block exits the block.
 *
 * The synchronized keyword can be used to mark four different types of blocks:
 *
 * Instance methods
 * Static methods
 * Code blocks inside instance methods
 * Code blocks inside static methods
 *
 *
 *
 *
 * A synchronized instance method in Java is synchronized on the instance (object) owning the method.
 * Thus, each instance has its synchronized methods synchronized on a different object: the owning instance.
 *
 * Only one thread per instance can execute inside a synchronized instance method.
 * If more than one instance exist, then one thread at a time can execute inside a synchronized
 * instance method per instance. One thread per instance.
 *
 *
 */
public class SynchronizedExample {
    public static void main(String[] args) {
        CalCulator cal = new CalCulator();

        Runnable runnable1 = ()->{
//            for(int i=0;i<1_000_000;i++){
//                cal.add();
//            }
            System.out.println("Count:: "+cal.add());
        };
        CalCulator cal1 = new CalCulator();

        Runnable runnable2 = ()->{
//            for(int i=0;i<1_000_000;i++){
//                cal.add();
//            }
            System.out.println("Count:: "+cal.sub());
        };


        Thread t1=  new Thread(runnable1,"t1");
        Thread t2 = new Thread(runnable2,"t2");

        t1.start();
        t2.start();
    }
}

class CalCulator{
    /**
     * In case of multiple synchronized methods
     * This is true across all synchronized instance methods for the same object (instance).
     * Thus, in the following example, only one thread can execute inside either of of the two synchronized methods.
     * One thread in total per instance:
     *
     */

    /**
     * Synchronized method
     * Here one thread per object lock
     */
    private int count=0;
    public synchronized int add(){
        this.count ++;
        //System.out.println("Inside the add");
        for(int i=0;i<5;i++){
            try {
                Thread.sleep(1000);
            }catch (Exception e){

            }
            System.out.println("CurrentThread--"+Thread.currentThread().getName());
        }
        return  this.count;

    }
    public synchronized int sub(){
        this.count --;
        //System.out.println("Inside the add");
        for(int i=0;i<5;i++){
            try {
                Thread.sleep(2000);
            }catch (Exception e){

            }
            System.out.println("Sub method ...CurrentThread--"+Thread.currentThread().getName());
        }
        return  this.count;

    }

}

class  MyStaticCounter{

    private static int count = 0;

    public static synchronized void add(int value){
        count += value;
        }

        public static synchronized void subtract(int value){
        count -= value;
        }
}