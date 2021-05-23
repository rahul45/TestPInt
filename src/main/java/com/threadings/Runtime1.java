package com.threadings;

public class Runtime1{  
	 public static void main(String args[])throws Exception{  
	  Runtime.getRuntime().exec("notepad");//will open a new notepad  
	  Runtime r=Runtime.getRuntime();  
	  System.out.println("Total Memory: "+r.totalMemory());  
	  System.out.println("Free Memory: "+r.freeMemory());  
	 }  
	}  