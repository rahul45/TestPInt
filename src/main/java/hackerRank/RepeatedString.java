package hackerRank;

import org.apache.commons.codec.binary.StringUtils;

public class RepeatedString {
    private static   long repeatedString(String s, long n) {
        // Write your code here
        if((s == null) || ( n ==0)){
            return 0L;
        }
        int len= s.length();
        long count;
        if(n<len){
          count = getCount(s.substring(0,(int)n).toCharArray());
          Arrays.
        }else{
            count = getCount(s.toCharArray());
            long remaining =(n/len);
            count = remaining*count + getCount(s.substring(0,(int)(n%len)).toCharArray());
        }
        return count;
    }

    private static int getCount(char [] ca){
        if(ca == null || ca.length == 0){
            return 0;
        }
        int count =0;
        for(char c :ca){
            if(c == 'a'){
                count ++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        System.out.println(repeatedString("ababa",3));
    }
}
