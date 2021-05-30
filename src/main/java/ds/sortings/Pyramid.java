package ds.sortings;

import java.util.Scanner;

public class Pyramid {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number:");
		int a = sc.nextInt();
		for(int i=0;i<=a;i++){
			for(int k=0;k<a-i;k++){
				System.out.print(" ");
			}
			for(int j=0;j<2*i-1;j++){
				System.out.print("*");
			}
		System.out.println("");	
		}
	}

}
