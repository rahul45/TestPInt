package test;

public class Pre {
 public static void main(String[] args) {
	int n =8;
	int mid =0;
	if(n%2==0){
		mid = n/2;
	}else{
		mid = (n/2)+1;
	}
	int i = 1;
	 while(i <= mid){
			 if(i%2 != 0){
				 for(int j=1;j<=i;j++){
					 System.out.print("*");
				 }
				 for(int j=1;j<=n-i;j++){
					 System.out.print("#");
				 }
			 }else{
				 for(int j=1;j<=n-i;j++){
					 System.out.print("#");
				 }
				 for(int j=1;j<=i;j++){
					 System.out.print("*");
				 }
			 }
		 System.out.println();
		 i++;
	 }
	 i--;
	 while(i<n){
		 if(i%2 == 0){
			 for(int j=1;j<=n-i;j++){
				 System.out.print("*");
			 }
			 for(int j=1;j<=i;j++){
				 System.out.print("#");
			 }
		 }else{
			 for(int j=1;j<=i;j++){
				 System.out.print("#");
			 }
			 for(int j=1;j<=n-i;j++){
				 System.out.print("*");
			 }
		 }
		 System.out.println();
		 i++;
	 }
	 
}
}
