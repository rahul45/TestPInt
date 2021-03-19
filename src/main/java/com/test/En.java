package com.test;

class En {
	public static void main(String[] args) {
		int a[] ={23,34,1,2,65,9};
		
		 sort(a,0,a.length);
	}

	private static void sort(int[] a, int init, int last) {
		if(init > last){
			int mid = (init+last)/2;
			sort(a,init,mid);
			sort(a,mid+1,last);
			merge(a,init,mid,last);
		}
	}

	private static void merge(int[] a, int init, int mid, int last) {
		int n1 = mid-init;
		int n2 = last-mid+1;
		int a1[] = new int[n1];
		int a2[]=new int[n2];
		for(int i=init,k=0;i<=mid & k<n1;i++,k++){
			a1[k] =a[i];
		}
		/*for(int l =mid+1,m=0;l<=last,m<n2;l++,m++){
			a2[m]=a[l];
		}*/
	}
}
