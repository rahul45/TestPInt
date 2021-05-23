package com.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.Collections;
import java.util.Arrays;
public class Test {
	
	public static void main1(String[] args) {
		B b = new B(1);
		System.out.println(b.add());
		A a =new B(3);
		System.out.println(a.add());
		A a1 = new A(4);
		System.out.println(a1.add());
	}
 public static void main21(String[] args) {
     
	 int a =0b1000;
	 System.out.println(a);
	 System.out.println(a);
 /* List<Employee> empList=getListOfEmp();
  System.out.println("before sorting the employee");
  for(Employee employee:empList){
	  System.out.println("EmpID : "+employee.getEmpID()+"\nName :"+employee.getName()+"\nSalary :"+employee.getSalary()
	  +"\nDesignation :"+employee.getDesignation()+" \n"
			  );
	  System.out.println(employee.toString());
	  
  }
  System.out.println("After sorting -----\n");
  Collections.sort(empList);
  for(Employee e : empList){
	  System.out.println(e.toString());
  }*/
}
 static List<Employee> getListOfEmp(){
	 List<Employee> list = new ArrayList<>();
	 for(int i =0;i<5;i++){
		 Employee e = new Employee();
		 Random r = new Random();
		 e.setEmpID(r.nextInt());
		 e.setDesignation("Software"+i);
		 e.setSalary(r.nextFloat());
		 e.setName("Rahul -:"+i);
		 list.add(e);
	 }
	 return list;
 }
 
 public static void main(String[] args) {
	 
	System.out.println(args.length+"---"+Arrays.toString(args));
}
 
}
