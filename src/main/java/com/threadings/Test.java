package com.threadings;

import java.util.List;

public class Test extends Thread {
	public void run() {
		for (;;) {
			System.out.println("Hellllll");
		}
	}

	public static void main(String[] args) {
		Test t = new Test();
		t.start();
	}

	public void p1(List<String> list) {
		for (String str : list) {
			System.out.println(str);
		}
	}

	public void p(List<Integer> list) {
		for (Integer str : list) {
			System.out.println(str);
		}
	}
}
