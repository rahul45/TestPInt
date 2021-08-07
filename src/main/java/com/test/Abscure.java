package com.test;

public class Abscure {
		String a ="8";

		String p(){
			String a ="10";
		    return this.a;
		}

	public static void main(String[] args) {
		Abscure ab = new Abscure();
		System.out.println(ab.p());
	}
		
}
