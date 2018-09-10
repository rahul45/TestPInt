package collections;

import java.util.Stack;

public class StackSort {
  public static void main(String[] args) {
	
	  Stack<Integer> s = new Stack();
	  s.add(123);
	  s.push(234);
	  s.push(543);
	  s.push(32);
	  System.out.println("Before:: "+s);
	  Stack<Integer> st= divide(s,s.size()-1);
	  System.out.println("After::"+st);
	 /* System.out.println(s.peek());
	  System.out.println(s);
	  System.out.println(s.pop());
	  System.out.println(s);
	  System.out.println(s.search(123));
	  System.out.println(s.search(234));
	  System.out.println(s.search(543));
	 System.out.println(s.size());
	 System.out.println(s.indexOf(543));
	 System.out.println(s.indexOf(123));*/
}
 public static Stack<Integer> divide(Stack<Integer> st,int top){
	 if(st.isEmpty()){
		 return st;
	 }
	int e = st.pop();
	top--;
	 if(top>0){
		divide(st,top); 
	 }
	 sort(st,e);
	 return st;
 }

private static void sort(Stack<Integer> st, int e) {
	if(!st.isEmpty()){
			if(e<st.peek()){
				int temp = st.pop();
				sort(st,e);
				st.push(temp);
			}else{
				st.push(e);
			}
	}else{
		st.push(e);
	}
} 
  
  
}
