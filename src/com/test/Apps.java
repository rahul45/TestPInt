package com.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Apps {
	public static void main(String[] args) {
		ArrayList<Student> stds= new ArrayList<>();
	
		Student s = new Student(12,"dRahul", 23);
		Student s1 = new Student(32,"aRahuwewl", 53);
		Student s3 = new Student(332,"hgRahuwewl", 25);
		Student s4 = new Student(2,"aRahuwerwl", 56);
		
		stds.add(s);
		stds.add(s1);
		stds.add(s3);
		stds.add(s4);
		
		System.out.println(stds.toString());
		Collections.sort(stds);
		System.out.println("After sorting ...");
		System.out.println(stds.toString());
		
		System.out.println("Sorting by name");
		stds.sort(new NameComperator());
		System.out.println(stds.toString());
	}
}
