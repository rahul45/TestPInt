package ds.sortings;

import java.util.Arrays;

public class CountSort {

    static int getMax(int arr[]){
        int max = 0;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }

    static int [] sort(int arr[]){
        int len = arr.length;
        int out[]= new int[len];
        int max = getMax(arr);
        int count[] = new int[max+1];
        Arrays.fill(count,0);
        //check the total count
        for(int i=0;i<len;i++){
            count[arr[i]]++;
        }
        //calculate index for each element in array
        for(int i=1;i<=max;i++){
            count[i] += count[i-1];
        }

        for(int i=max;i>=0;i--){
            count[i]--;
        }

        for(int i=0;i<len;i++){
            out[count[arr[i]]]=arr[i];
            count[arr[i]]--;
        }
        return out;

    }

    public static void main(String[] args) {
        int arr[]={3,4,101,6,4,6,100};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(sort(arr)));
    }
}
