package com.threadings;

public class ThreadA implements Runnable{
   
	public long delay;
	@Override
	public void run() {
		int i =1;
		while(i<5){
			System.out.println("Lets start.. i=="+i);
			i++;
			try {
				Thread.sleep(this.delay);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			Math.abs(23);
		}
	}
	
	public static void main(String[] args) {
		ThreadA a = new ThreadA();
		a.delay =1000;
		
		ThreadA b = new ThreadA();
		b.delay = 2000;
		Thread t  = new Thread(a);
		Thread t1  = new Thread(b);
		t.start();
		t.setPriority(9);
		t1.setPriority(2);
		t1.start();
		/*try {
			//t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
	}

}
