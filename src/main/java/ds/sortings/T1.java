package ds.sortings;

import java.util.ArrayList;
import java.util.List;

public class T1 {
    public int solution(int N) {
        int numSum = digitSum(N);
        while(true){
            int nextDigitSum = digitSum(N++);
            if(nextDigitSum == numSum){
                return N;
            }
        }
    }
    static int digitSum(int num){
        List<Integer> list = new ArrayList<>();
        int sum = 0;
        while(num > 0){
            list.add(num%10);
            num = num/10;
        }
        for(Integer item : list){
            sum =sum +item;
        }
        return sum;
    }
}
