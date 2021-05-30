package ds.sortings;

import java.util.Arrays;

public class SelectionSort {
    private static void sort(int arr[]){
        if(arr!= null){
            for(int i=0;i<arr.length-1;i++){
                System.out.println("\ni="+i+"");
                for(int j=i+1;j<arr.length;j++){
                    System.out.print("j="+j);
                    if(arr[i]>arr[j]){
                        int temp = arr[i];
                        arr[i] =arr[j];
                        arr[j] =temp;
                    }
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
