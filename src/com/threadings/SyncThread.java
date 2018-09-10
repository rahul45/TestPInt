package com.threadings;

public class SyncThread implements Runnable {
  
	@Override
	public void run(){
	  makeWithdrawl();
	 // dis();
  }
	private synchronized void makeWithdrawl(){
		System.out.println(Thread.currentThread().getName() +" making withdrawl !!");
		try{
			dis();
			Thread.sleep(2000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+" is completing withdrawl !!");
	} 
	private  void dis(){
		System.out.println("Hello brother --"+Thread.currentThread().getName());
	}
	public static void main(String[] args) throws InterruptedException {
		SyncThread s1 = new SyncThread();
		Thread d = new Thread(s1);
		Thread d2 = new Thread(s1);
		d.setName("Lucy !");
		d2.setName("Pitt");
		StringBuilder s = new StringBuilder();
		StringBuffer b = new StringBuffer();
		d.start();
		d2.start();
		d2.join();
		
		
	}
}
