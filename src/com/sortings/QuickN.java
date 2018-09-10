package com.sortings;

import java.util.Arrays;

public class QuickN {

	public static void main(String[] args) {
		int a[] ={23,34,12,45,23};
		quickSort(a,0,a.length-1);
		System.out.println(Arrays.toString(a));
	}

	private static void quickSort(int[] a, int left, int right) {
		if(left >= right){
			return;
		}
		int pivot = a[right];
		int index=partition(a,left,right,pivot);
		quickSort(a, left, index-1);
		quickSort(a, index, right);
	}

	private static int partition(int[] a, int left, int right, int pivot) {
		while(left<=right){
			while(a[left]<pivot){
				left++;
			}
			while(a[right]>pivot){
				right--;
			}
			if(left <= right){
				int temp = a[left];
				a[left] = a[right];
				a[right] =temp;
				left++;
				right--;
			}
		}
		return left;
	}
	

}
