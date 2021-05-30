package com.test;

import java.util.HashSet;
import java.util.Set;

public class t{

	public static void p(){
		System.out.println("hiii");
	}
	public static void main(String[] args) {
		int a =3;
		Set s= new HashSet();
		s.add(123);
		try {
			Class<?> aq = Class.forName("com.test.t");
			try {
				t e=(t)aq.newInstance();
				e.p();
			} catch (InstantiationException | IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
   
}
