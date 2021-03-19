package com.sortings;

public class ContigousAndNonContigousSum {

	public static void main(String[] args) {
		System.out.println("Rahul Singh Bhadouria");
		ContigousAndNonContigousSum p = new ContigousAndNonContigousSum();
		System.out.println(p.findContigousSum(new int[]{-5,-6,-10,-9,-2,-8,-2,-1,-3,-2}));
	}
	
	 int findContigousSum(int a[]){
		int len =a.length;
		int lSum=0;
		int rSum =0;
		int left =0;
		int right =len-1;
			while(a[left]<0&&left<right){
				left++;
			}
			while(a[right]<0 && right>left){
				right--;
			}
			if(left >= right){
				return findMinVal(a);
			}
			while(left<=right){
				lSum = a[left]+lSum;
				if(lSum<0){
					lSum=0;
				}
				if(left==right)break;
				rSum =rSum+a[right];
				if(rSum<0){
					rSum=0;
					
				}
				left ++;
				right--;
			}
			return lSum+rSum;
	}

	private int findMinVal(int[] a) {
		int min=a[0];
		for(int i :a){
			if(min<i){
				min=i;
			}
		}
		return min;
	}
}
