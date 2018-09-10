package com.threadings;

public class ExtendThreadClass extends Thread{
    @Override
	public void run(){
    	int i =1;
		while(i<5){
			System.out.println("Lets start.. i=="+i);
			i++;
			try {
				this.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
   }
   public static void main(String[] args) throws InterruptedException {
	   ExtendThreadClass t = new ExtendThreadClass();
	   t.start();
	 try {
		Thread.sleep(1000);
	} finally{}
}
}

