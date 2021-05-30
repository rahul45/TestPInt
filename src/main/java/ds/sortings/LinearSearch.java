package ds.sortings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LinearSearch {
 public static void main(String[] args) {
	int [] a={1,6,7};
    int num =100;
    List<String> comb = new ArrayList();
    List l =getR(a,num,comb,null,0);
    System.out.println("List___"+l.toString());
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
}
