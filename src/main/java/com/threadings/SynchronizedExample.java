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
    public static void main1(String[] args) {
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

    //Static example
    public  static void main(String[] args) {
        MyStaticCounter sc = new MyStaticCounter();

        Runnable runnable1 = ()->{
//            for(int i=0;i<1_000_000;i++){
//                cal.add();
//            }
            sc.add(12);
            //System.out.println("Count:: "+sc.add(12));
        };
        MyStaticCounter sc1 = new MyStaticCounter();

        Runnable runnable2 = ()->{
//            for(int i=0;i<1_000_000;i++){
//                cal.add();
//            }
            sc1.subtract(12);
            //System.out.println("Count:: "+cal.sub());
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

/**
 * Static methods are marked as synchronized just like instance methods using the synchronized keyword.
 * Here is a Java synchronized static method example:
 *
 * Also here the synchronized keyword tells Java that the add() method is synchronized.
 *
 * Synchronized static methods are synchronized on the class object of the class the synchronized static method belongs to.
 * Since only one class object exists in the Java VM per class,
 * only one thread can execute inside a static synchronized method in the same class.
 *
 * In case a class contains more than one static synchronized method,
 * only one thread can execute inside any of these methods at the same time.
 * Look at this static synchronized method example:
 *
 *
 * Only one thread can execute inside any of the two add() and subtract() methods at any given time.
 * If Thread A is executing add() then Thread B cannot execute neither add() nor subtract() until Thread A has exited add().
 *
 * If the static synchronized methods are located in different classes, then one thread can execute inside the static
 * synchronized methods of each class. One thread per class regardless of which static synchronized method it calls.
 *
 */
class  MyStaticCounter{

    private static int count = 0;

    public static synchronized void add(int value) {

        count += value;
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {

            }
            System.out.println("Sub method ...CurrentThread--" + Thread.currentThread().getName());
        }
    }


    public static synchronized void subtract(int value){

        count -= value;
        for (int i = 0; i < 5; i++) {
        try {
            Thread.sleep(1000);
        }catch (Exception e){

        }
        System.out.println("Sub method ...CurrentThread--"+Thread.currentThread().getName());
        }
    }
}