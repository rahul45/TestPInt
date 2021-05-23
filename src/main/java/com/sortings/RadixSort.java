package com.sortings;

import java.util.ArrayList;
import java.util.Arrays;

public class RadixSort {

    static int getMax(int arr[]){
        int max = 0;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }

    static void sort(int arr[],int exp){
        int len = arr.length;
        int out[]= new int[len];
        //int max = getMax(arr);
        int count[] = new int[10];
        Arrays.fill(count,0);
        //check the total count
        for(int i=0;i<len;i++){
            count[(arr[i]/exp)%10]++;
        }
        //calculate index for each element in array
        for(int i=1;i<10;i++){
            count[i] += count[i-1];
        }

        for(int i=9;i>=0;i--){
            count[i]--;
        }

        for(int i=0;i<len;i++){
            out[(count[(arr[i]/exp)%10])]=arr[i];
            count[(arr[i]/exp)%10]--;
        }
        for(int i=0;i<len;i++){
            arr[i]=out[i];
        }
        //return out;
    }

    static void radixSort(int arr[]){
        int max = getMax(arr);
        int l = arr.length;

        for(int exp=1; max/exp >0 ;exp=exp*10){
            sort(arr,exp);
            //System.out.println(exp);
        }

    }

    public static void main(String[] args) {
        int arr[]={3,4,101,6,4,6,100};
        System.out.println(Arrays.toString(arr));
        radixSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
