package hackerRank;

    import java.util.*;
    public class DqP {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            Deque deque = new ArrayDeque<>();
            int n = in.nextInt();
            int m = in.nextInt();
            Deque<Integer> d = new ArrayDeque();
            int rVal = 0;
            int lVal=0;
            int idx =0;
            for (int i = 0; i < n; i++) {
                int num = in.nextInt();
                d.offer(num);
            }
           	 while(d.size()>m-1){
                     rVal = 0;
                     List<Integer> list = new ArrayList<>();
                     for(int j=idx;j<m;j++){
                    	 list.add(d.pop());
                     }
                     for(int j=0;j<m;j++){
                    	 
                     }
                     
                     d.pop();
                     if(lVal <rVal){
                         lVal = rVal;
                     }
                     idx++; 
                 }
            System.out.println(lVal);
        }
    }
