package com.sortings;

import java.util.ArrayList;

public class ArraySearchByPeakValue {
 public static void main(String[] args) {
	int []arr ={100,20,15,66,23,90,101};
	int i=0;
	boolean lflag=true;
	boolean rflag = false;
	ArrayList list = new ArrayList<>();
	while(i<arr.length){
		if(i>0){
		if(arr[i]>arr[i-1]){
			lflag = true;
		}else{
			lflag=false;
		}
		}
		if(i<arr.length-1){
		if(arr[i]>arr[i+1]){
			rflag=true;
			i+=2;
		}else{
			rflag=false;
			i++;
		}
		}else if(i==arr.length-1){
			rflag=true;
			i+=2;
		}
		if(rflag&&lflag){
			list.add(arr[i-2]);
		}
		
	}
	System.out.println(list.toString());
}
 
}
