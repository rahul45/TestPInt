package hackerRank;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Stack;

public class JavaStack extends Stack {
	public static void main(String[] args) {
			String str = "(({({)}}))";
			System.out.println(anotherWay(str));
	}

	private static boolean isBalanced(String str) {
		int left_curl_count =0;
		int right_curl_count=0;
		int left_small_count=0;
		int right_small_count=0;
		int left_sq_count=0;
		int right_sq_count=0;
		if(str == null || str.isEmpty()){
			return true;
		}
		if(str.length()%2 != 0){
			return false;
		}
		
	   char []  arr = str.toCharArray();
	   for(char e : arr){
		 switch(e){
		 case '(':
			 left_small_count++;
			 break;
		 case ')':
			 if(left_small_count ==0||left_small_count< ++right_small_count){
				 return false;
			 }
			 break;
		 case '{':
			 left_curl_count++;
			 break;
		 case '}':
			 if(left_curl_count == 0 || left_curl_count < ++right_curl_count){
				 return false;
			 }
			 break;
		 case '[':
			  left_sq_count++;
			 break;
		 case ']':
			 if(left_sq_count==0||left_sq_count< ++right_sq_count){
				 return false;
			 }
			 break;
		 }  
	   }
	   if(left_small_count != right_small_count || left_curl_count != right_curl_count
				  || left_sq_count != right_sq_count){
			 return false;
		 }
		return true;
	}
  private static boolean anotherWay(String str){
	  Stack<Character> stack = new Stack<>();
	  for(char c :str.toCharArray()) {
          if(c == '{' || c == '(' || c == '[') {
             stack.push(c);
             continue;
          }                    
          if(c == '}' && !stack.isEmpty() && stack.peek() == '{') {
              stack.pop();
              continue;
          }
          if(c == ')' && !stack.isEmpty() && stack.peek() == '('){
              stack.pop();
              continue;
          }
          if(c == ']' && !stack.isEmpty() && stack.peek() == '['){
              stack.pop();
              continue;
          }
          
          if(c == '}' || c == ')' || c == ']') {
              stack.push(c);
              break;
          }   
      }
	return stack.isEmpty();
  }
}
