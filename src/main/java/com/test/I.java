package com.test;


import java.io.Serializable;
import java.util.concurrent.ThreadLocalRandom;

public final class I implements Serializable{
  class P{
	  void main(){}
  }
  public static void main(String[] args) {
	int a1=ThreadLocalRandom.current().nextInt(1, 11);
	System.out.println(a1);
}
}
