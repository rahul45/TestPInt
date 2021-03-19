package com.sortings;

import java.util.Scanner;

public class CielingAndFloor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = { 1, 2, 8, 10, 10, 12, 19 };
		int x;
		System.out.println("Enter the x ::");
		x = sc.nextInt();
		int mid = (a.length - 1) / 2;
		int i = 0;
		int l = a.length - 1;
		
		if(x > a[l]){
			System.out.println("Ceiling does not exist for "+x);
		}else{
			System.out.println("Ceiling== "+findCeil(i, mid, l, a, x));
		}
		if(x<a[0]){
			System.out.println("Floor does not exist for ::: input-"+x);
		}else{
			System.out.println("Floor ==="+findFloor(i, mid, l, a, x));
		}
		
	}

	static int findCeil(int init, int mid, int last, int a[], int x) {
		if (mid >= init) {
			if (x <= a[mid]) {
				if(x == a[mid]){
					return a[mid];
				} 
				if(x > a[mid-1]){
					return a[mid];
				}
				 return findCeil(init,(mid+init)/2,mid,a,x);
			}else{
				if(x==a[mid+1]){
					return mid+1;
				}
				return findCeil(mid+1,(mid+last+1)/2,last,a,x);
			}
		}else{
			return a[mid];
		}
	}
	
	static int findFloor(int init,int mid,int last,int a[],int x){
		if (mid>init) {
			if (x >= a[mid]) {
				if(x< a[mid+1])return a[mid];
				 return findFloor(mid+1,(mid+last+1)/2,last,a,x);
			}else{
				return findFloor(init,(mid+init)/2,mid,a,x);
			}
		}else{
			return a[mid];
		}
	}
}
