package ds.sortings;

import java.util.Arrays;

public class MatrixMul {
public static void main(String[] args) {
	int a[][]={
			{1,2,3},
			{1,5,3},
			{1,2,3}
			};
	int b[][]={
			{1,1,1},
			{1,1,1},
			{1,1,1}
			};
	int a_row=a.length;
	int b_row =b.length;
	int a_col =a[a_row-1].length;
	int b_col= b[b_row-1].length;
	
	if(a_col != b_row){
		System.out.println("mutiplication is not allowed!!");
	}
	int row=0;
	int col=0;
	int c[][]= new int[a_row][b_col];
	int temp = 0;
	for(int i=0;i<a_row;i++){
		
		for(int j=0;j<a_col;j++){
			c[i][j] = 0;
			for(int k =0;k<b_col;k++){
				c[i][j] = c[i][j] + a[i][k]*b[k][j];
			}
		}
	}
	
	for(int i=0;i<3;i++){
	System.out.println(Arrays.toString(c[i]));
	}
}
}
