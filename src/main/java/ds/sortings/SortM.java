package ds.sortings;

public class SortM {
public static void main(String[] args) {
	 int arr[] = {12, 11, 13, 5, 6, 7};
	  
     System.out.println("Given Array");
     printArray(arr);
     sort(arr,0,arr.length-1);
     System.out.println("after sorting Array");
     printArray(arr);
}
/* A utility function to print array of size n */
static void printArray(int arr[])
{
    int n = arr.length;
    for (int i=0; i<n; ++i)
        System.out.print(arr[i] + " ");
    System.out.println();
}

static void sort(int arr[],int init,int last){
	if(init<last){
		int mid = (init+last)/2;
		
		sort(arr,init,mid);
		sort(arr,mid+1,last);
		merge(arr,init,mid,last);
	}
}
private static void merge(int[] arr, int init, int mid, int last) {
	int n1 =mid-init+1;
	int n2 = last-mid;
	int L[] = new int[n1];
	int R[] = new int[n2];
	
	//copy data to temp array 
	for(int i=0;i<n1;++i){
		L[i] =arr[init+i];
	}
	for(int j=0;j<n2;++j){
		R[j] =arr[mid+1+j];
		
	}
	int i=0,j=0;
	int k=init;
	
	while(i<n1&&j<n2){
		if(L[i]<=R[j]){
			arr[k]=L[i];
			i++;
		}else{
			arr[k]= R[j];
			j++;
		}
		k++;
	}
		 /* Copy remaining elements of L[] if any */
	     while (i < n1)
	     {
	         arr[k] = L[i];
	         i++;
	         k++;
	     }

	     /* Copy remaining elements of R[] if any */
	     while (j < n2)
	     {
	         arr[k] = R[j];
	         j++;
	         k++;
	     }
}
}
