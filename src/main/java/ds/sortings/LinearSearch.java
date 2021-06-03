package ds.sortings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LinearSearch {
 public static void main(String[] args) {
	int [] a={1,6,7};
    int num =100;
//    List<String> comb = new ArrayList();
//    List l =getR(a,num,comb,null,0);
//    System.out.println("List___"+l.toString());

	 getL();
 }
 
 static List getR(int []a,int num,List comb,String pre,int seen){
	 	int rem=0;
	    int div=0;
		for(int i :a){
			if(num<i){
				break;
			}
			if(seen == i){
				continue;
			}
	    	if((rem =num%i)==0){
	    		if(pre != null && !pre.equalsIgnoreCase("0")){
	    			comb.add(pre+":"+i+"-"+(num/i));
	    			}else{
	    				comb.add(i+"-"+(num/i));
	    			}
	    		System.out.println(i+"-"+(num/i));
	    	}else{
	    		getR(a,rem,comb,i+"-"+num/i,0);
	    		int occ = num/i;
	    		if((occ)>1){
	    			String last = (String) comb.get(comb.size()-1);
		    		String[] rep= last.split(":");
		    		for(String str:rep){
		    			if(Integer.parseInt(str.split("-")[0])==i){
		    				int p= Integer.parseInt( str.split("-")[1]);
		    				last.replaceFirst(i+"-"+p,i+"-"+(p-1));
		    			}
		    		}
	    			getR(a,i,comb,last,i);
	    		}
	    	}
	    }
		return comb;
 }
 
 public void method(){
	 HashMap<String, String> map = new HashMap<>();
	 map.put("23", "232");
 }

 static void getL(){
 	int a[] ={7,6,2};
 	int n= 100;
 	int val;
 	int tempArr[] = new int[3-1];

 	for(int i=0;i<3;i++){
		int max = n/a[i];
		int rem = n%a[i];

		int k=0;
		for(int j=0;j<3;j++){
			if(j!=i){
				tempArr[k] = a[j];
				k++;
			}
		}
		while(max>=0){

			int p =rem / tempArr[0];
			int r= rem %tempArr[0];
			if(p ==  0){
				int p1= rem/tempArr[1];
				int r1= rem%tempArr[1];
				if(r1 != 0){
					max--;
					rem= rem +a[i];
					continue;
				}else{
					System.out.println(a[i]+"-"+max+","+tempArr[0]+"-"+p+","+tempArr[1]+"-"+p1);
				}
			}else{
				int p1= r/tempArr[1];
				if(r%tempArr[1] != 0){
					max--;
					rem= rem +a[i];
					continue;
				}else{
					System.out.println(a[i]+"-"+max+","+tempArr[0]+"-"+p+","+tempArr[1]+"-"+p1);
				}
			}
			max --;
			rem= rem +a[i];
		}

	}
 }

}
