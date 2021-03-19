package hackerRank;

public class X implements Runnable{
	String name;
	long d;
	public X(String name){
		this.name=name;
		System.out.println("Inside the constructor!!");
	}
	public void setName(String name){
		this.name=name;
	}
	public void setD(long d){
		this.d=d;
	}
	@Override
	public void run() {
		int i=0;
		while(i<4){
			try {
				Thread.sleep(this.d);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("thread--"+this.name);
			i++;
		}
	}
	
 public static void main(String[] args) throws InterruptedException {
	X x = new X("thread1");
	x.setD(2000);
	Thread t = new Thread(x);
	t.start();
	
	X x1= new X("thread2");
	x1.setName("Thread2");
	x1.setD(1000);
	Thread t1= new Thread(x1);
	t1.setName("Rahul");
	/*System.out.println("Name 1="+t.getName());
	System.out.println("Name 2="+t1.getName());*/
    System.out.println(t1.toString());
	t1.run();
}
}
