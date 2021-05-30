package ds.sortings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Test {
	
	public static void main(String[] args) {
		int sep= solution(new int []{1,34,54,34,2,43,65});
		
		System.out.println(sep);
	}
	public static int solution(int []a){
		List<Integer> list = new ArrayList();
		
		for(int i :a){
			list.add(i);
		}
		Collections.sort(list);
		int dist =0;
		for(int i=1;i<list.size();i++){
			if(list.get(i-1)!=list.get(i)){
				int temp = getIndex(a,(Integer)(list.get(i)))-getIndex(a,(Integer)(list.get(i-1)));
				if(Math.abs(temp)>dist){
					dist =Math.abs(temp);
				}
			}
		}
		return dist;
	}
	
	static int getIndex(int []a,int val){
		for(int i =0;i<a.length;i++){
			if(a[i] == val){
				return i;
			}
		}
		return -1;
	}
     static int solution(String S) {
        long value =getDecimal(S); 
        int steps =0;
        while(value != 0){
            if(value % 2 == 0){
                value = value/2;    
            }else{
                value--;
            }    
            steps++;
        }
        return steps;
    }
     static long getDecimal(String s){
        long decimalVal =0;
        char arr[] = s.toCharArray();
        for(int i =arr.length-1;i>0;i--){
            if(arr[i] != '0'){
                  decimalVal = decimalVal+twoThePower(arr.length-i-1);  
            }    
        }
        return decimalVal;
    }
    static long twoThePower(int repeatation){
        long val =1;
        for(int i=1;i<=repeatation;i++){
            val = val*2;
        }    
        return val;
    }
}