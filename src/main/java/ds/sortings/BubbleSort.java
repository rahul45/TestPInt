package ds.sortings;

import java.util.Arrays;

public class BubbleSort {

    public static void sort(int arr[]){
        if(arr != null){
            for(int i= 0;i<arr.length-1;i++){
                for(int j=0;j<arr.length-1-i;j++){
                    if(arr[j]>arr[j+1]){
                        int temp = arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1] =temp;
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
