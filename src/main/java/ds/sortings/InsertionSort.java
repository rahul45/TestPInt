package ds.sortings;

import java.util.Arrays;

public class InsertionSort {
    private static void sort(int arr[]){
        if(arr!= null){
            for(int i=1;i<arr.length;i++){
                System.out.println("\ni="+i+"");
                    int j=i-1;
                    int k=i;
                    while(j>=0){
                        if(arr[j]>arr[k]){
                            int temp=  arr[j];
                            arr[j]=arr[k];
                            arr[k]=temp;
                            k--;
                        }
                        j--;
                    }
                }
            }
        }
    public static void main(String[] args) {
        int arr[] = {5,8,9,6,5,4,3,2,1};
        System.out.println("Before--\n"+ Arrays.toString(arr));
        sort(arr);
        System.out.println("After--\n"+Arrays.toString(arr));
    }
}
