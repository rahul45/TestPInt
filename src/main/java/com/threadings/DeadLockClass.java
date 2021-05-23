package com.threadings;

public class DeadLockClass extends Thread implements Runnable  {
	@Override
	public void run() {
		read();
		write(23,34);
	}
	private static class Resource {
		public int value;
	}

	private Resource resourceA = new Resource();
	private Resource resourceB = new Resource();

	public int read() {
		synchronized (resourceA) { // May deadlock here
			System.out.println("inside the read method insdie res A --Thread::  "+Thread.currentThread().getName());
			synchronized (resourceB) {
				System.out.println("inside the read method insdie res B  --Thread::  "+Thread.currentThread().getName());
				return resourceB.value + resourceA.value;
			}
		}
	}

	public void write(int a, int b) {
		synchronized (resourceB) { // May deadlock here
			System.out.println("inside the write method insdie res B  --Thread::  "+Thread.currentThread().getName());
			synchronized (resourceA) {
				System.out.println("inside the write method insdie res A  --Thread::  "+Thread.currentThread().getName());
				resourceA.value = a;
				resourceB.value = b;
			}
		}
	}
	public static void main(String[] args) {
		DeadLockClass d = new DeadLockClass();
		Thread d1 = new Thread(d);
		Thread d2 = new Thread(d);
		d1.start();
		d2.start();
	}
}
