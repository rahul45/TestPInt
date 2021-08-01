package test;

import java.util.Arrays;

public class A {
	private void say(){
		System.out.println("Hello A");
	}

	private void hello(){
		if(true){
			System.out.println("HelloP");
			return;
		}else{
			return;
		}
		//System.out.println("hello");
	}

	public static void main(String[] args) {

		int i =0;
		System.out.println(solution(new int[]{1, 3, 6, 4, 1, 2}));

	}
	static int solution(int[] A) {
		int max= 1;
		int len = A.length;
		int i =0;
		A = sort(A,len);
		while(i<len){
			if(A[i]>0){
				while( i <len && A[i] == max) {
					i++;
				}
				i--;
				if(A[i] == max){
					max++;
				}else{
					return max;
				}
			}
			i++;
		}
		return max;
	}

	static int [] sort(int arr[],int len){
		for(int i=0;i<len;i++){
			for(int j=0;j<len-i-1;j++){
				if(arr[j] >arr[j+1]){
					int temp = arr[j];
					arr[j] =arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return arr;
	}

//	static int [] sort(int arr[],int len){
//		for(int i=0;i<len;i++){
//			for(int j=0;j<len-i-1;j++){
//               if(arr[j] >arr[j+1]){
//               	  int temp = arr[j];
//               	  arr[j] =arr[j+1];
//               	  arr[j+1] = temp;
//			   }
//			}
//		}
//		return arr;
//	}
}
