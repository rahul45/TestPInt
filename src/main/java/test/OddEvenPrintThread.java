package test;

public class OddEvenPrintThread {

    int counter =1;
     int N =15;

    public void printEven(){
        synchronized (this){
            while(counter <N){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if(counter%2 == 1){
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(counter);
                counter++;
                notify();
            }
        }

    }

    public void printOdd(){
        synchronized (this){
            while(counter <N){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if(counter%2 == 0){
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }

                System.out.println(counter);
                counter++;
                notify();
            }
        }

    }

    public static void main(String[] args) {
        OddEvenPrintThread oddEvenPrintThread = new OddEvenPrintThread();

        Runnable runnable1=()->{
            oddEvenPrintThread.printOdd();
        };
        Runnable runnable2=()->{
            oddEvenPrintThread.printEven();
        };

        Thread odd = new Thread(runnable1);
        Thread even = new Thread(runnable2);
        odd.start();
        even.start();


    }


}
