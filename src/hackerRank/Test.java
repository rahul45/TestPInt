package hackerRank;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Stack;

public abstract class Test implements A,B{

	@Override
	public void met() {
		// TODO Auto-generated method stub
		
	}
	
	 public static void main(String[] args) {
	 Stack<Integer> s = new Stack();
	 s.add(12);
	 s.add(54);
	 s.add(5);
	 s.add(34);
	 s.add(87);
    System.out.println(s.toString());
    System.out.println(sortStack(s).toString());
	}
	 
	 public static Stack<Integer> sortStack(Stack<Integer> input){
	        if(input!= null && ! input.empty() ){
	            int value = input.pop();
	            sortStack(input);
	            inertValueInStack(input,value);
	        }
	        return input;
	    }
	    public static void inertValueInStack(Stack<Integer> input,int value){
	        if(input.empty()){
	           input.push(value);
	            return;
	        }
	        int temp = input.pop();
	        
	        } 	
	       
	        
	    }
