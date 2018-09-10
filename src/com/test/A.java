package com.test;

public class A {
	private String name;
	private int age;
	private int rollno;
	
  public A(int a){
	  System.out.println("inside the a ="+a);
  }
  public A(){
	  
  }
  public static void main(String[] args) {
		System.out.println(new Abscure().p());
	}
  public Object add(){
	  System.out.println("add in A");
	  return "Hell A";
  }
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public int getRollno() {
	return rollno;
}
public void setRollno(int rollno) {
	this.rollno = rollno;
}
int a =20;
static int  p;
  
}
