package com.sortings;

import java.util.*;
import java.lang.*;
import java.io.*;

public class GFG {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of arra size::");
		int N = sc.nextInt();
		int arr[] = new int[N];
		for (int j = 0; j < N; j++) {
			System.out.println("Enter element in array !!");
			arr[j] = sc.nextInt();
		}
		int elem[] = findVal(arr);
		System.out.println("Those two element are !!");
		System.out.println(Arrays.toString(elem));
	}

	static int[] findVal(int a[]) {
		int len = a.length;
		if (len < 2) {
			return a;
		}
		int elem[] = { a[0], a[1] };
		int sum = a[0] + a[1];
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (Math.abs(sum) > Math.abs(a[i] + a[j])) {
					sum = a[i] + a[j];
					elem[0] = a[i];
					elem[1] = a[j];
				}
			}
		}
		return elem;
	}

}
