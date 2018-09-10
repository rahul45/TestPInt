package collections;

import java.util.PriorityQueue;
import java.util.Random;

public class StackP {
 public static void main(String[] args) {
	//Stack s = new Stack();
	PriorityQueue s = new PriorityQueue<>();
	Random r = new Random();
	for(int i =1; i<11 ;i++){
		s.add(r.nextInt());
	}
	System.out.println(s.toString());
	System.out.println(s.toString());
	System.out.println(s.toString());
}
}
